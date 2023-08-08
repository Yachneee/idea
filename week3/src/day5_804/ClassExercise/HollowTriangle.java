import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        //输入行数 显示如图所示的空心三角形
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入你想要的空心三角形的行数：");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print("  ");
            }
//            System.out.print("* ");
//            if(i==row){
//                for(int j=0;j<2*row-2;j++){
//                    System.out.print("* ");
//                }
//            }else if(i!=1) {
//                    for(int j=0;j<2*i-3;j++){
//                        System.out.print("  ");
//                    }
//                    System.out.print("* ");
//            }
            for(int j=1;j<=2*i-1;j++){
                if(i==row){
                    System.out.print("* ");
                }else{
                    if(j==1||j==2*i-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }
}
