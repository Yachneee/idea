package day5_818;

import java.util.Arrays;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(Calculator.primeSum(5));
        int[] arr={3,1,-1,9,8,18,2,4,3};
        Calculator.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Calculator.binarySearch(arr,3));
    }


}
