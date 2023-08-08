import java.util.Scanner;

public class StringSquare {
    public static void main(String[] args) {
        //一个循环，打印输出一个由字符构成的正方形图案，其中边长由用户输入确定。要求字符按照以下顺序循环使用：'#','@','*'。
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入正方形边长：");
        int d = sc.nextInt();
        System.out.println("边长为 "+d+" 的正方形如下：");
        for(int i=1;i<=d;i++){
            if(i==1 || i==d){
                for(int j=1;j<=d;j++){
                        if(j==1 || j==d){
                            System.out.print("# ");
                        }else{
                            System.out.print("@ ");
                        }
                }
            }else{
                for(int j=1;j<=d;j++){
                    if(j==1 || j==d){
                        System.out.print("@ ");
                    }else{
                        System.out.print("* ");
                    }
                }

            }
            System.out.println();
        }
    }
}
