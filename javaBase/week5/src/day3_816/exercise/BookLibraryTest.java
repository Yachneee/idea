package day3_816.exercise;

import java.util.Scanner;

public class BookLibraryTest {
    static Scanner sc=new Scanner(System.in);
    static Library lib=new Library();
    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.print("请输入操作编号：");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> addBook();
                case 2 -> findBook();
                case 3 -> showAllBook();
                case 4 -> {
                    System.out.println("退出成功，再见！");
                    return;
                }
            }
        }
//        stack.addBook(new Book("《活着》","余华",1993,30));
    }
    public static void menu(){
        System.out.println("-------------");
        System.out.println("1. 添加图书");
        System.out.println("2. 查找图书");
        System.out.println("3. 显示所有图书");
        System.out.println("4. 退出");
        System.out.println("-------------");
    }
    public static void addBook(){
        System.out.print("请输入图书书名：");
        String title=sc.next();
        System.out.print("请输入图书作者：");
        String name=sc.next();
        System.out.print("请输入图书出版年份：");
        int year= sc.nextInt();
        System.out.print("请输入图书价格：");
        double price= sc.nextDouble();
        Book b = new Book(title, name, year, price);
        if(lib.addBook1(b)){
            System.out.println("添加成功！");
        }else{
            System.out.println("识别不到内容，添加失败！");
        }
    }
    public static void findBook(){
        System.out.print("请输入图书名：");
        String title=sc.next();
        Book book=lib.findBook(title);
        if(book==null){
            System.out.println("没有此书！");
        }else{
            book.showBook();
        }

    }
    public static void showAllBook(){
        lib.showBooks();
    }
}
