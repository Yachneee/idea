package day3_906.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 */
public class Pra2{
    static class Student{
        private int id;
        private static int count=1;
        private int score;
        Student(){
            id=count++;
            score=(int)Math.ceil((Math.random()*40+60));
        }

        @Override
        public String toString() {
            return "Student{" +
                    "学号：" + id +
                    ", 分数：" + score +
                    '}';
        }
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        for (int i = 0; i < 20; i++) {
            l.add(new Student());
        }
        l.forEach(o -> System.out.println(o));
        sort(l);
        System.out.println("分数最高的学生为："+l.getLast());
        System.out.println("分数最低的学生为："+l.getFirst());
    }

    /**
     * 将学生集合按照分数升序排序
     * @param a 要排序的集合
     */
    public static void sort(LinkedList a){
        a.sort((o1,o2)->{
            Student s1=(Student)o1;
            Student s2=(Student)o2;
            return s1.score-s2.score;
        });
    }

}

