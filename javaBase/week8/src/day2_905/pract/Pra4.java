package day2_905.pract;

import java.util.Vector;

/**
 * @author Yachne
 */
public class Pra4 {
    static Vector<Double> studentsScore= new Vector<>();
    public static int countInRange(double min,double max){
        if(min>max){
            return -1;
        }
        int count=0;
        for (Double s : studentsScore) {
            if(s<=max&&s>=min){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        studentsScore.add(85.5);
        studentsScore.add(90.0);
        studentsScore.add(100.0);
        studentsScore.add(97.5);
        studentsScore.add(60.5);
        studentsScore.add(60.0);
        studentsScore.add(55.5);
        System.out.println("成绩在90~100的学生人数为："+countInRange(90, 100));
    }
}
