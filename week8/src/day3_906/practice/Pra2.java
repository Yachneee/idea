package day3_906.practice;

import java.util.LinkedList;
/**
 * @author Administrator
 */
public class Pra2{
    static class Student{
        private int id;
        private static int count=1;
//        private int score;
        private double score;
        Student(){
            id=count++;
//            score=(int)Math.ceil((Math.random()*40+60));
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
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        for (int i = 0; i < 20; i++) {
            l.add(new Student());
        }
        sort(l);
        l.forEach(o -> System.out.println(o));
        System.out.println("first："+l.getFirst());
        System.out.println("last："+l.getLast());
    }

    /**
     * 将学生集合按照分数升序排序
     * @param a 要排序的集合
     */
    public static void sort(LinkedList a){
        a.sort((o1,o2)->{
            Student s1=(Student)o1;
            Student s2=(Student)o2;
            return s2.score>s1.score?1:s2.score==s1.score?0:-1;
        });
    }

}

