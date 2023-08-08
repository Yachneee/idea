package day2_808.exercise;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        //一个班级有若干学生，每个学生的成绩以整数表示。请实现一个程序，根据学生的成绩对他们进行排名并输出。
        Random r=new Random();
        int[] score=new int[20];
        for (int i = 0; i < score.length; i++) {
            score[i]=r.nextInt(101);
            System.out.print(score[i]+"\t");
        }
        System.out.println();
        //插入排序
        for (int i = 1; i < score.length; i++) {
            int current=score[i];
            int j=i-1;
            while (j>=0 && current>score[j]){
                score[j+1]=score[j];
                j--;
            }
            score[j+1]=current;
        }
        //输出排序后的数组
        System.out.println("排名"+"\t\t"+"成绩");
        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1)+"\t\t"+score[i]);
        }
    }
}
