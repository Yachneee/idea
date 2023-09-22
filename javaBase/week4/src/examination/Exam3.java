package examination;

import java.util.Arrays;
import java.util.Scanner;

public class Exam3 {
    public static void insert(int[] arr,int[] arrNew,int index,int num){
        System.arraycopy(arr,0,arrNew,0,index);
        arrNew[index]=num;
        System.arraycopy(arr,index,arrNew,index+1,arr.length-index);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arrNew=new int[arr.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入下标和数字：");
        int index=sc.nextInt();
        int num=sc.nextInt();
        insert(arr,arrNew,index,num);
        System.out.println(Arrays.toString(arrNew));
    }
}
