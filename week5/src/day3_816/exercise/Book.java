package day3_816.exercise;

public class Book {
    //Book类：表示图书，包含属性：书名（title）、作者（author）、出版年份（year）、价格（price）
    String title;
    String author;
    int year;
    double price;
    public Book(String title,String author,int year,double price){
        this.title=title;
        this.author=author;
        this.year=year;
        this.price=price;
    }
    public void showBook(){
        System.out.println(title+"是"+year+"年"+author+"出版的，价格为："+price);
    }
}
