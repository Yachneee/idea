package day3_816.exercise;
public class LibraryTest {
    public static void main(String[] args) {
        Library stack=new Library(3);
//        stack.addBook("《小王子》","安托万·德·圣埃克苏培里",1943,20);
//        stack.addBook("《追风筝的人》","卡勒德·胡赛尼",1999,25);
//        stack.addBook("《活着》","余华",1993,30);
//        stack.addBook("《活着》","余华",1993,30);
        stack.addBook(new Book("《小王子》","安托万·德·圣埃克苏培里",1943,20));
        stack.addBook(new Book("《追风筝的人》","卡勒德·胡赛尼",1999,25));
        stack.addBook(new Book("《活着》","余华",1993,30));
        stack.addBook(new Book("《活着》","余华",1993,30));
        stack.findBook("《Java面向对象》");
        stack.showBooks();
    }

}
