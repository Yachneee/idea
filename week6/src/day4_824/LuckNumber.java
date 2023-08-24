package day4_824;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Administrator
 */
public class LuckNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(luckArr(20,1,40)));
    }
    public static String[] luckArr(int count, int min, int max) {
        Random r = new Random();
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < count; i++) {
            int n= r.nextInt(max-min+1)+min;
            while(str.toString().contains(String.valueOf(n))){
                n= r.nextInt(max-min+1)+min;
            }
            str.append(n);
            if(i<count-1){
                str.append(".");
            }
        }
        return str.toString().split("\\.");
    }
}
