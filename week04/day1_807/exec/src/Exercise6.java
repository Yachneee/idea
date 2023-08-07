import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //定义一个长度为20的数组，元素为20-40的随机数，要求判断指定元素在数组中出现的次数，
        //指定元素为键盘录入范围为20-40之间。
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(21)+20;
//            System.out.print(arr[i]+"\t");
        }
//        System.out.println();
        System.out.print("请输入20-40之间的一个数字，以判断它在数组arr中出现的次数：");
        int num = sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(num+" 在数组arr中出现的次数为："+count);
    }
}
