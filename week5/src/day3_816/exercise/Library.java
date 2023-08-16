package day3_816.exercise;

public class Library {
    //Library类：表示图书馆，包含属性：书库（使用数组保存图书）、添加图书的方法、查找图书的方法、显示所有图书的方法
    Book[] books;
    int index;
    public Library(int num){
        books=new Book[num];
        index=0;
    }
    public void addBook(Book book){
        if(index== books.length){
            System.out.println("书库已满，不可添加！");
        }else{
            books[index]=book;
            System.out.println("添加成功！");
            index++;
        }
    }
//    public void addBook(String title,String author,int year,double price){
//        if(index== books.length){
//            System.out.println("书库已满，不可添加！");
//        }else{
//            books[index]=new Book(title,author,year,price);
//            System.out.println("添加成功！");
//            index++;
//        }
//    }

    public void findBook(String title){
        int i = 0;
        for (; i < books.length; i++) {
            if(books[i].title.equals(title)){
                books[i].showBook();
            }
        }
        if(i== books.length){
            System.out.println("没有找到！");
        }
    }
    public void showBooks(){
        for (Book book : books) {
            book.showBook();
        }
    }
}
