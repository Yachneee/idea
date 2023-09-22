package day1_911.practice;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class Pra1 {
    public static void main(String[] args) {
        String[] arr= {"a", "b", "c"};
        String reduce = Arrays.stream(arr).reduce("", (str1, str2) -> str1 + str2);
        System.out.println(reduce);
    }
}
