import java.util.Random;
import java.util.Scanner;

public class Exercise8_1 {
    public static void main(String[] args) {
        //定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）


        //先从键盘获取数组长度，再随机生成一组
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("请输入一个数字作为数组长度：");
        int l = sc.nextInt();
        int[] a=new int[l];
        for (int i = 0; i < l; i++) {
            a[i]=r.nextInt(100)+1;
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        //使用冒泡排序，若相邻两个数左边是偶数，右边是奇数，则交换位置
        for (int i = 0; i < a.length-1; i++) {  // 外层控制判断相邻数奇偶数轮数
            for (int j = i; j < a.length-i-1; j++) {  // 内层控制判断相邻数奇偶数及交换次数，每轮结束能确保分别将一个奇数、偶数放在左右侧（除非没有）
                if(a[j]%2==0 && a[j+1]%2!=0){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }


//        System.out.println("变化后的数组a_copy为：");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a_copy[i]+"\t");
//        }

        System.out.println("变化后的数组a为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
}
