import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。
        // 请编写程序计算，这个数组所表示的整数值。例如：
        //1 数组：{2, 1, 3, 5, 4}
        //2 表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
//        Scanner sc=new Scanner(System.in);
        int[] a=new int[]{3,2,1,4,5};
        int sum=0;

        for (int i = 0; i < a.length; i++) {
            int place=a[i];
            for (int j = 0; j < a.length-i-1; j++) {
                place*=10;
            }
            sum+=place;
        }
        System.out.println(sum);
    }
}
