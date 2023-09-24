package exem;

import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class BookManager{
    static {
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private final Connection con;
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manager","root","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private final Scanner sc=new Scanner(System.in);
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
            Statement statement1 = con.createStatement();
            statement1.executeUpdate(sql1);
            Statement statement2 = con.createStatement();
            statement2.executeUpdate(sql2);
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean isExit(){
        try(Statement statement = con.createStatement()) {
            List<String> list=new ArrayList<>();
            String sql="show tables";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                list.add(resultSet.getString(1));
            }
            return list.size() >= 2 && list.contains("books") && list.contains("operation_log");
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return false;
    }

    /**
     * 控制台输出不同颜色
     * @param str 要输出的字符串
     * @param colorNum 颜色编号
     */
    private void printColor(String str,int colorNum){
        String format="\033["+colorNum+";1m%s%n\033[0m";
        //%s--字符串，%n--换行。
        // +m--- 0 空样式  1 粗体   4 下划线  7 反色
        //colorNum(前景色)----30  白色   31  红色   32  绿色   33  黄色   34  蓝色  35  紫色   36  浅蓝   37  灰色
        //背景颜色：  40-47 和前景色颜色顺序相同
        //90-97  比前景色更鲜艳一些
        //字体样式、前景色、背景色之间用分号(;)隔开
        System.out.printf(format,str);
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
        try (Statement statement = con.createStatement()) {
            int i = statement.executeUpdate(sql);
            if(i>0){
                printColor("添加"+title+"成功",35);
            }else {
                printColor("添加"+title+"失败",33);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        log("新增图书 - 书名："+title);
    }
    //可以根据⽤⼾控制台输⼊删除图书信息表 (books) 中对应的数据
    private void removeBook(){
        System.out.print("请输入要删除的书名：");
        String title = sc.next();
        String sql="delete from books where book_title='"+title+"'";
        try (Statement statement = con.createStatement()) {
            int i = statement.executeUpdate(sql);
            if(i>0){
                printColor("删除"+title+"成功",31);
            }else {
                printColor("删除"+title+"失败",33);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        log("删除图书记录 - 书名："+title);
    }
    //可以根据⽤⼾控制台输⼊选择⼀条图书信息并修改其数量（数量要⽐原值⼤）
    private void modifyBookQuantity(){
        System.out.print("请输入要修改的书名：");
        String title = sc.next();
        int quantity;
        try (Statement statement = con.createStatement()) {
            String sql="select quantity from books where book_title='"+title+"'";
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            quantity=resultSet.getInt(1);
        } catch (SQLException e) {
            printColor("找不到书。。",33);
            return;
        }
        System.out.print("请输入要修改的数量：");
        int count=sc.nextInt();
        while(count<=quantity){
            System.out.print("数量没有增多，请重新输入：");
            count=sc.nextInt();
        }

        try (Statement statement = con.createStatement()) {
            String sql="update books set quantity="+count+" where book_title='"+title+"'";
            int i = statement.executeUpdate(sql);
            if(i>0){
                printColor("修改"+title+"数量成功",34);
            }else {
                printColor("修改"+title+"数量失败",33);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        log("修改图书信息 - 书名："+title+" 原数量： "+quantity+"  修改后： "+count);
    }

    /**
     * 查询图书信息表 (books) 中所有的数据
     */
    private void showAllBooks(){
        try (Statement statement = con.createStatement()) {
            String sql="select * from books";
            ResultSet resultSet = statement.executeQuery(sql);
            boolean hasNext = resultSet.next();
            if(!hasNext){
                printColor("sorry，现在还没有图书。。。",33);
            } else {
                ResultSetMetaData metaData = resultSet.getMetaData();
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.print("\033[30;7m "+metaData.getColumnLabel(i)+"\t\033[0m");
                }
                System.out.println();
                while(hasNext){
                    for (int i = 1; i <= metaData.getColumnCount(); i++) {
                        System.out.print("\033[30;7m "+resultSet.getObject(i)+"\t\033[0m");
                    }
                    System.out.println();
                    hasNext=resultSet.next();
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 完善每个功能，将用户的每个操作都记录在日志表( log )中
     * @param desc 操作
     */
    private void log(String desc) {
        LocalDateTime time=LocalDateTime.now();
        String sql="insert into operation_log(description,operation_time) values('"+desc+"','"+time+"')";
        try (Statement statement = con.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 将以上功能设计为可交互的系统，可以通过用户控制台输入来执行相应操作。并添加退出系统功能。
     */
    public void open(){
        printColor("***欢迎来到开发喵图书管理系统***",36);
        while (true){
            printColor("1.显示所有图书信息",36);
            printColor("2.添加图书",36);
            printColor("3.删除图书",36);
            printColor("4.修改图书数量",36);
            printColor("0.退出系统",36);
            System.out.print("请输入操作数：");
            int type = sc.nextInt();
            switch (type){
                case 1->showAllBooks();
                case 2->addBookInfo();
                case 3->removeBook();
                case 4->modifyBookQuantity();
                default -> {
                    try {
                        con.close();
                        printColor("退出成功，再见!!!",36);
                        System.exit(1);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
