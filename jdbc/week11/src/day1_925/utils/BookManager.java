package day1_925.utils;

import day1_925.handler.Book;
import day1_925.handler.BookHandler;
import day1_925.handler.StringHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class BookManager {
    private final Scanner sc=new Scanner(System.in);
    private final DBUtils utils=new DBUtils();
    public BookManager() throws IOException, SQLException, ClassNotFoundException {
        init();
    }
    private void init() throws SQLException, ClassNotFoundException {
        if(isExit()){
            return;
        }
        File f=new File("D:\\kaifamiao\\java\\jdbc\\io\\sql.txt");
        try (FileInputStream in = new FileInputStream(f)) {
            String str=new String(in.readAllBytes());
            String[] sqlS = str.split(";");
            String sql1=sqlS[0];
            String sql2=sqlS[1];
            utils.executeU(sql1);
            utils.executeU(sql2);
        } catch (IOException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean isExit() throws SQLException, ClassNotFoundException {
        String sql="show tables";
        List<String> list = utils.executeQ(sql, new StringHandler());
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
    private void addBookInfo() throws SQLException, ClassNotFoundException {
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
        String sql="insert into books(book_title,publication_date,author,price,quantity) values(?,?,?,?,?)";
        int i = utils.executeU(sql,title,date,author,price,quantity);
        if(i>0){
            System.out.println(printColor("添加"+title+"成功",35));
            log("新增图书 - 书名："+title);
        }else {
            System.out.println(printColor("添加"+title+"失败",33));
        }
    }
    //可以根据⽤⼾控制台输⼊删除图书信息表 (books) 中对应的数据
    private void removeBook() throws SQLException, ClassNotFoundException {
        System.out.print("请输入要删除的书名：");
        String title = sc.next();
        String sql="delete from books where book_title=?";
        int i = utils.executeU(sql,title);
        if(i>0){
            System.out.println(printColor("删除"+title+"成功",31));
            log("删除图书记录 - 书名："+title);
        }else {
            System.out.println(printColor("删除"+title+"失败",33));
        }
    }
    //可以根据⽤⼾控制台输⼊选择⼀条图书信息并修改其数量（数量要⽐原值⼤）
    private void modifyBookQuantity() throws SQLException, ClassNotFoundException {
        System.out.print("请输入要修改的书名：");
        String title = sc.next();
        String sql="select * from books where book_title=?";
        List<Book> books = utils.executeQ(sql, new BookHandler(),title);
        int quantity;
        if(!books.isEmpty()){
            quantity = books.get(0).getQuantity();
            System.out.print("请输入要修改的数量：");
            int count=sc.nextInt();
            while(count<=quantity){
                System.out.print("数量没有增多，请重新输入：");
                count=sc.nextInt();
            }
            String sql1="update books set quantity=? where book_title=?";
            int i = utils.executeU(sql1,count,quantity);
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
    private void showAllBooks() throws SQLException, ClassNotFoundException {
        String sql="select * from books";
        List<Book> books = utils.executeQ(sql, new BookHandler());
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
    private void log(String desc) throws SQLException, ClassNotFoundException {
        LocalDateTime time=LocalDateTime.now();
        String sql="insert into operation_log(description,operation_time) values(?,?)";
        int i = utils.executeU(sql,desc,time);
        if(i>0){
            System.out.println(printColor("插入日志成功",35));
        }else {
            System.out.println(printColor("插入日志失败", 33));
        }
    }
    /**
     * 将以上功能设计为可交互的系统，可以通过用户控制台输入来执行相应操作。并添加退出系统功能。
     */
    public void open() throws SQLException, ClassNotFoundException {
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
                    utils.close();
                    System.exit(1);
                }
            }
        }
    }
}
