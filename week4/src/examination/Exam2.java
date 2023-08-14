package examination;

import java.util.Scanner;

public class Exam2 {
    public static int searchIndex(int[] arr,int num){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num<arr[mid]){
                end=mid-1;
            } else if (num>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={11,23,45,68,69,70};
        System.out.print("请输入一个数字：");
        int num=sc.nextInt();
        int index=searchIndex(arr,num);
        System.out.println(num+"在arr中的下标为："+index);
    }
}
