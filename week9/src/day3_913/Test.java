package day3_913;

import day5_908.am.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    static class Student{
        private String name;
        private int age;
        public Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Collections.addAll(list,new Student("zs",18),new Student("ls",19),new Student("ww",20));
        list.sort((o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(list);
        Student[] students={new Student("zs",18),new Student("ls",19),new Student("ww",20)};
        quickSort(students,0, students.length-1);
        System.out.println(Arrays.toString(students));

    }
    public static void quickSort(Student[] students,int left,int right){
        if(left>=right){
            return;
        }
        int i=left;
        int j=right;
        Student bench=students[left];
        while (i<j){
            while (i<j&&students[j].name.compareTo(bench.name)>=0){
                j--;
            }
            while (i<j&&students[i].name.compareTo(bench.name)<=0){
                i++;
            }
            if(i<j){
                Student temp=students[i];
                students[i]=students[j];
                students[j]=temp;
            }
        }
        if(bench.name.compareTo(students[i].name)>=0){
            students[left]=students[i];
            students[i]=bench;
        }
        quickSort(students,left,i-1);
        quickSort(students,i+1,right);
    }
}
