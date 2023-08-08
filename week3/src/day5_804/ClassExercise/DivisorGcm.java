import java.util.Scanner;

public class DivisorGcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入两个整数：");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m= a < b ? a : b;
        int mult=1;
        int c=1;
        int d=1;
        for(int i=1;i<=m;i++){
            if( a%i==0 && b%i==0){
                mult=i;

            }
        }
        c=a/mult;
        d=b/mult;
        System.out.println(a+"和"+b+"的最大公约数为："+mult);
        System.out.println(a+"和"+b+"的最小公倍数为："+mult*c*d);

        sc.close();
    }
}
