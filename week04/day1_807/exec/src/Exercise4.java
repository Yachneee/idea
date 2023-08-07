import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //按要求在main方法中完成以下功能：
        //a. 定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字作为数组元素
        //b. 生成2-10（范围包含2和10）之间的随机数num
        //c. 遍历数组arr,筛选出数组中不是num倍数的元素并输出
        //PS：输入的数组元素范围包括1和60，不需要代码判断
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int arr[]=new int[5];
        System.out.println("请输入5个1~60（包含1和60）的数字作为数组元素：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int num=r.nextInt(9)+2;
        System.out.println("不是 "+num+" 倍数的数组元素：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%num!=0){
                System.out.println("    索引："+i+"，元素为："+arr[i]);
            }
        }
    }
}
