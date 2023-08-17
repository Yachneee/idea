package day3_816.exercise;


public class Library {
    //Library类：表示图书馆，包含属性：书库（使用数组保存图书）、添加图书的方法、查找图书的方法、显示所有图书的方法
    Book[] books;
    int index;
    public Library(){
        books=new Book[2];
        books[0]=new Book("《小王子》","安托万·德·圣埃克苏培里",1943,20);
        books[1]=new Book("《追风筝的人》","卡勒德·胡赛尼",1999,25);
        index=2;
    }
    public boolean addBook(Book book){
        if(index== books.length){
            return false;
        }else{
            books[index]=book;
            index++;
        }
        return true;
    }
    public boolean addBook1(Book book){
        if(index==books.length){
            System.out.println("书库已满，需要扩容！");
            expandBooks();
        }
        if(book==null){
            return false;
        }
        books[index]=book;
        index++;
        return true;
    }
    public Book findBook(String title){
        for (int i = 0; i < index; i++) {
            if(books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }
    public void showBooks(){
        for (int i = 0; i < index; i++) {
            books[i].showBook();
        }
    }
    public void expandBooks(){
        int newSize=books.length*10;
        Book[] newBooks=new Book[newSize];
        System.arraycopy(books,0,newBooks,0,books.length);
        books=newBooks;
        System.out.println("扩容成功！");
        System.out.println("现在的容量为："+books.length);
    }
}
