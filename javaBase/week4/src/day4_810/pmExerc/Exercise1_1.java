package day4_810.pmExerc;
/**
 * @author Administrator
 */
public class Exercise1_1 {
    public static void main(String[] args) {
//        定义一个5*5的二维数组并初始化，找出最大值的坐标
        int[][] arr = {
                {56, 6, 3, 7, 5},
                {34, 10, 5, 10, 4},
                {354, 435, 34, 23, 54},
                {325, 56, 98, 454, 3},
                {3, 5, 7, 6, 4},
        };
        int a=0;
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>arr[a][b]){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("最大值的坐标为："+a+" "+b);
    }
}
