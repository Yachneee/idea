package day1_911.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Administrator
 */
public class Pra4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, -1, -2, 4});
        System.out.printf("整数集合所有元素平方的平均值%.2f",squareAverage(list));
    }
    public static double squareAverage(Collection<Integer> collection){
        Integer squareSum = collection.stream().map(n -> n * n).reduce(0, (i1, i2) -> i1 + i2);
        return squareSum*1.0/collection.size();
    }
}
