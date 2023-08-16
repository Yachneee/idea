package day3_816.exercise;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("阿尼亚",5,1);
        s1.setScore(-1);
        s1.setScore(80);
        System.out.println("s1的学号为："+s1.getStudentId()+"，姓名为："+s1.getName()+"的年龄为："+s1.getAge()+"，成绩为："+s1.getScore());
    }
}
