import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        //接收用户输入的数字,判断在此范围内质数的个数，例如输入90，输出0-90以内的所有质数的数量
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num = sc.nextInt();
        int count=0;
        for(int i=2;i<=num;i++){
            boolean b=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    b=false;
                    break;
                }
            }
            if(b){
                count++;
            }
        }
        System.out.println(num+"以内的质数有 "+count+" 个");

    }
}
