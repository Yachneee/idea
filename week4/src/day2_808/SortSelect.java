package day2_808;

import java.util.Random;
import java.util.Scanner;
//     选择排序
public class SortSelect {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        //从键盘获取数组长度
        System.out.print("请输入数组长度：");
        int l = sc.nextInt();
        //生成长度为l的随机整数数组[0,100),并输出
        System.out.println("长度为 "+l+" 的0到99的整数随机数组为：");
        int[] a=new int[l];
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(100);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        //选择排序
        for (int i = 0; i < a.length; i++) {  //遍历数组，每次从排序好的数组的下一个开始
            int current=a[i];
            int minIndex=i;
            for (int j = i+1; j < a.length; j++) {  //从a[i]的下一个开始和a[i]比较，找到最小数的下标，交换下标
                if(a[minIndex]>a[j]){
                    minIndex=j;  //找到最小数的下标（每一次比较找到较小的下标，用该数和后面的数再比较）
                }
            }
            a[i]=a[minIndex];  //交换数字
            a[minIndex]=current;
        }
        //输出排序后的数组
        System.out.println("经过选择排序升序后为：");
        for (int arr : a) {
            System.out.print(arr+"\t");
        }
    }
}
