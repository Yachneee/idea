import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int ran=r.nextInt(100)+1;
        for(int i=1;i<=100;i++){
            System.out.println("请输入你猜测的数:");
            int num=sc.nextInt();
            if(num==ran){
                System.out.println("恭喜你猜对了");
                break;
            } else if (num>ran) {
                System.out.println("猜大了*.*");
            } else{
                System.out.println("猜小了#.#");
            }
        }

    }
}
