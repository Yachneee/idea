package day4_907.practice;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Pra4 {
    static class Student implements Comparable{
        private int id;
        private static int count=1;
        private double score;
        Student(){
            id=count++;
            double d=Math.random()*41+60;
            d=d>100?100:d;
            String str=String.format("%.1f",d);
            score=Double.parseDouble(str);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "学号：" + id +
                    ", 分数：" + score +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            Student s=(Student)o;
            return s.score>this.score?1:s.score==this.score?0:-1;
        }
    }

    public static void main(String[] args) {
        TreeSet l=new TreeSet();
        for (int i = 0; i < 20; i++) {
            l.add(new Student());
        }
        l.forEach(o -> System.out.println(o));
        System.out.println("first："+l.first());
        System.out.println("last："+l.last());
    }
}
