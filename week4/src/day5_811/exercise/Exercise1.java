package day5_811.exercise;

public class Exercise1 {
    /** 求和设计一个方法，用于计算整数的和 */
     public static int sum(int ... nums){
         int sum=0;
         for (int num : nums) {
             sum+=num;
         }
         return sum;
     }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
    }
}
