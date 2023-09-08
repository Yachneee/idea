package day5_908.am;

import java.util.ArrayList;

/**
 * @author Yachne
 */
public class Student {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class StudentDemo implements School<Student> {
    ArrayList<Student> a=new ArrayList<>();
    @Override
    public void add(Student student) {
        a.add(student);
    }

    @Override
    public Student show(String name) {
        for (Student student : a) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
    public <T> void test(T t,Student s){
        System.out.println("我是泛型方法"+t);
        add(s);
    }
}
class StudentDemoTest{
    public static void main(String[] args) {
        StudentDemo studentDemo=new StudentDemo();
        studentDemo.add(new Student("张三",18));
        System.out.println(studentDemo.show("张三"));
        studentDemo.test("1",new Student("李四",20));
        System.out.println(studentDemo.a);
    }
}