package day1_925.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class BookManager {
    private Connection getCon() throws SQLException {
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/manager","root","");
    }
    private final Scanner sc=new Scanner(System.in);
    private int executeU(String sql){
        try{Connection con = getCon();
            Statement stat = con.createStatement();
            int i= stat.executeUpdate(sql);
            stat.close();
            con.close();
            return i;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private <E> List<E> executeQ(String sql,Handler<E> handler){
        try {
            Connection conn = getCon();
            Statement stat = conn.createStatement();
            ResultSet resultSet = stat.executeQuery(sql);
            List<E> list = new ArrayList<>();
            int count = resultSet.getMetaData().getColumnCount();
            Object[] objects = new Object[count];
            while (resultSet.next()) {
                // 构建出一个数组  数组里面放的是一行数据
                for (int i = 0; i < count; i++) {
                    objects[i] = resultSet.getObject(i + 1);
                }
                E one = handler.getOne(objects);
                list.add(one);
            }
            stat.close();
            conn.close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public BookManager(){
        init();
    }
    private void init(){
        if(isExit()){
            return;
        }
        File f=new File("D:\\kaifamiao\\java\\jdbc\\io\\sql.txt");
        try (FileInputStream in = new FileInputStream(f)) {
            String str=new String(in.readAllBytes());
            String[] sqlS = str.split(";");
            String sql1=sqlS[0];
            String sql2=sqlS[1];
            executeU(sql1);
            executeU(sql2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean isExit(){
        String sql="show tables";
        List<String> list = executeQ(sql,new StringHandler());
        return list.contains("books") && list.contains("operation_log");
    }

    /**
     * 控制台输出不同颜色
     * @param str 要输出的字符串
     * @param colorNum 颜色编号
     */
    private String printColor(String str,int colorNum){
        String format="\033[%dm%s\033[0m";
        return String.format(format,colorNum,str);
    }
    /**
     * 根据⽤⼾控制台输⼊向图书信息表 (books) 中插⼊数据
     */
    private void addBookInfo(){
        System.out.print("请输入书名：");
        String title = sc.next();
        System.out.print("请输入出版日期：");
        String date=sc.next();
        System.out.print("请输入作者：");
        String author=sc.next();
        System.out.print("请输入价格：");
        double price=sc.nextDouble();
        System.out.print("请输入数量：");
        int quantity=sc.nextInt();
        String sql="insert into books(book_title,publication_date,author,price,quantity) values('"+title+"','"+date+"','"+author+"',"+price+","+quantity+")";
        int i = executeU(sql);
        if(i>0){
            System.out.println(printColor("添加"+title+"成功",35));
            log("新增图书 - 书名："+title);
        }else {
            System.out.println(printColor("添加"+title+"失败",33));
        }
    }
    //可以根据⽤⼾控制台输⼊删除图书信息表 (books) 中对应的数据
    private void removeBook(){
        System.out.print("请输入要删除的书名：");
        String title = sc.next();
        String sql="delete from books where book_title='"+title+"'";
        int i = executeU(sql);
        if(i>0){
            System.out.println(printColor("删除"+title+"成功",31));
            log("删除图书记录 - 书名："+title);
        }else {
            System.out.println(printColor("删除"+title+"失败",33));
        }
    }
    //可以根据⽤⼾控制台输⼊选择⼀条图书信息并修改其数量（数量要⽐原值⼤）
    private void modifyBookQuantity(){
        System.out.print("请输入要修改的书名：");
        String title = sc.next();
        String sql="select * from books where book_title='"+title+"'";
        List<Book> books = executeQ(sql, new BookHandler());
        int quantity;
        if(!books.isEmpty()){
            quantity = books.get(0).getQuantity();
            System.out.print("请输入要修改的数量：");
            int count=sc.nextInt();
            while(count<=quantity){
                System.out.print("数量没有增多，请重新输入：");
                count=sc.nextInt();
            }
            String sql1="update books set quantity="+count+" where book_title='"+title+"'";
            int i = executeU(sql1);
            if(i>0){
                System.out.println(printColor("修改"+title+"数量成功",34));
                log("修改图书信息 - 书名："+title+" 原数量： "+quantity+"  修改后： "+count);
            }else {
                System.out.println(printColor("修改"+title+"数量失败",33));
            }
        }else {
            System.out.println(printColor("找不到书。。",33));
        }
    }

    /**
     * 查询图书信息表 (books) 中所有的数据
     */
    private void showAllBooks(){
        String sql="select * from books";
        List<Book> books = executeQ(sql, new BookHandler());
        if(books.isEmpty()){
            System.out.println(printColor("sorry，现在还没有图书。。。",33));
        }else {
            for (Book book : books) {
                System.out.println(printColor(book.toString(), 7));
            }
        }
    }
    /**
     * 完善每个功能，将用户的每个操作都记录在日志表( log )中
     * @param desc 操作
     */
    private void log(String desc) {
        LocalDateTime time=LocalDateTime.now();
        String sql="insert into operation_log(description,operation_time) values('"+desc+"','"+time+"')";
        int i = executeU(sql);
        if(i>0){
            System.out.println(printColor("插入日志成功",35));
        }else {
            System.out.println(printColor("插入日志失败", 33));
        }
    }
    /**
     * 将以上功能设计为可交互的系统，可以通过用户控制台输入来执行相应操作。并添加退出系统功能。
     */
    public void open(){
        System.out.println(printColor("***欢迎来到开发喵图书管理系统***",36));
        while (true){
            System.out.println(printColor("""
                    1.显示所有图书信息
                    2.添加图书
                    3.删除图书
                    4.修改图书数量
                    0.退出系统
                    """,36));
            System.out.print("请输入操作数：");
            int type = sc.nextInt();
            switch (type){
                case 1->showAllBooks();
                case 2->addBookInfo();
                case 3->removeBook();
                case 4->modifyBookQuantity();
                default -> {
                    System.out.println(printColor("退出成功，再见!!!",36));
                    System.exit(1);
                }
            }
        }
    }
}
