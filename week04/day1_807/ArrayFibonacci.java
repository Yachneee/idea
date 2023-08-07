import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入你想要的数列长度：");
        int num = sc.nextInt();
        int Fibo[]=new int[num];
        Fibo[0]=1;

//        if(num==1){
//            System.out.println(Fibo[0]);
//        } else if (num==2) {
//            System.out.println(Fibo[0]);
//            System.out.println(Fibo[1]);
//        }else{
//            for (int i = 2; i < num; i++) {
//                Fibo[i]=Fibo[i-2]+Fibo[i-1];
//            }
//        }
        if(num>=2){
            Fibo[1]=1;
            for (int i = 2; i < num; i++) {
                Fibo[i]=Fibo[i-2]+Fibo[i-1];
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(Fibo[i]);
        }

    }
}
