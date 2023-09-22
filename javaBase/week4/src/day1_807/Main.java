package day1_807;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double arr1[]=new double[3];
        System.out.println(arr1[0]);

        Double arr2[]=new Double[3];
        System.out.println(arr2[0]);

        arr1= Arrays.copyOf(arr1,7);
        System.out.println(arr1[6]);

        int sum=0;
        for (int i = 1; i < 100; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0) {
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if(count==2){
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}