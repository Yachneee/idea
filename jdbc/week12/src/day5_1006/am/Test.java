package day5_1006.am;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        Star star=new Star("蔡徐坤","湖南","China");
        Student student=new Student(1,"张三","11111111111");
        Print.outConsole(star,student);
        PrintFile.outConsole(star,student);
    }
}
