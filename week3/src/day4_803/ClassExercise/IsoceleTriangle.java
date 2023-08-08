import java.util.Scanner;

public class IsoceleTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入你想要的等腰三角形的行数：");
        int row=sc.nextInt();
        System.out.println(row+"行的等腰三角形如下：");
        for(int i=1;i<=row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
