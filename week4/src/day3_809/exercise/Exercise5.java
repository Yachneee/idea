package day3_809.exercise;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        //有如下数组nums，请通过删除掉其中的33，得到一个新的数组newNums
        int[] nums= {2, 11, 33, 44, 55, 66, 277};
        //newNums = {2, 11, 44,55, 66, 277}

        //System类中的arraycopy方法实现
        int[] newNums=new int[nums.length-1];
//        int number=33;
//        int index=-1;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==number){
//                index=i;
//            }
//        }
        int index=Arrays.binarySearch(nums,33);
        System.out.println("用System类中的arraycopy方法，得到的新数组newNums：");
        System.arraycopy(nums,0,newNums,0,index);
        System.arraycopy(nums,index+1,newNums,index,newNums.length-index);
        System.out.println(Arrays.toString(newNums));

        //for循环（自己写方法实现）
        System.out.println("用for循环+if语句，得到的新数组newNums1：");
        int[] newNums1=new int[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            if(i<index){
                newNums1[i]=nums[i];
            } else if (i>index) {
                newNums1[i-1]=nums[i];
            }
        }
        System.out.println(Arrays.toString(newNums1));
    }
}
