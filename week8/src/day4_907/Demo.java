package day4_907;

import java.util.ArrayList;

/**
 * @author Yachne
 */
public class Demo {
    static class Student{
        private String name;
        private int age;
        Student(){}
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "姓名：'" + name + '\'' +
                    ", 年龄：" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(new Student("zs",18));
        a.add(new Student("ls",19));
        a.add(new Student("ww",20));
        a.add(new Student("sl",18));
        a.add(new Student("lm",21));
        a.sort((o1,o2)->{
            Student s1=(Student) o1;
            Student s2=(Student) o2;
            return s1.name.compareTo(s2.name);
//            return s1.age-s2.age;
        });
        a.forEach(o -> System.out.println(o));
    }
}
