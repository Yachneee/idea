import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        //随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中，结束游戏
        Random r=new Random();
        //[0,99]+1 -> [1,100]
        int ran=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<101;i++){
            System.out.println("请输入你猜测的数字：");
            int a=sc.nextInt();
            if(a>=1&&a<=100){
                if(a==ran){
                    System.out.println("恭喜你，猜对了^n^");
                    break;
                } else if (a<ran) {
                    System.out.println("┗|｀O′|┛ 嗷~~过小了");
                }else{
                    System.out.println("(⊙o⊙)？过大了");
                }
            }else{
                System.out.println("你输入的数字不符合要求!-!");
            }
        }
        sc.close();
    }
}
