import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //需求：求出数组中索引与索引对应的元素都是奇数的元素
        //分析：
        //1、遍历数组
        //2、判断索引是否是奇数（索引 % 2 != 0）
        //3、判断索引对应的元素是否是奇数(arr[索引] % 2 != 0)
        //4、满足条件输出结果
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int l = sc.nextInt();
        int a[]=new int[l];
        System.out.print("请输入 "+l+" 个整数作为数组元素：");
        for (int i = 0; i < l; i++) {
            a[i]=sc.nextInt();
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println("索引及其元素都为奇数：");
        for (int i = 0; i < l; i++) {
            if(i%2!=0 && a[i]%2!=0){
                System.out.println("    索引为 "+i+" ,对应元素为 "+a[i]);
            }
        }
        sc.close();
    }
}
