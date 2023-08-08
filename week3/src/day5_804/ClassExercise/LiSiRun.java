import java.util.Scanner;

public class LiSiRun {
    public static void main(String[] args) {
        //李四每天跑步
        //第一周周一跑 100 米，周二到周天每天比前一天多 100 米。
        //往后每周一比前一周周一多 100 米。
        //请问 李四 n（控制台输入） 天后跑了多少米
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入天数：");
        int n = sc.nextInt();
        int s=0;
        int t=0;
        int sum=0;
        for(int i=1;i<=n/7+1;i++){
            s+=100;
            if(n%7==0 && i==n/7+1){
            }else{
                System.out.println("第 "+i+" 周：");
            }
            if(i<=n/7){
                for(int j=1;j<=7;j++){
                    t=s+100*(j-1);
                    System.out.print("今天是周"+j+"，跑了 "+t+" 米。");
                    sum+=t;
                    System.out.println("打卡第 "+((i-1)*7+j)+" 天，一共跑了 "+sum+" 米。");
                }
            }else{
                for(int j=1;j<=n%7;j++){
                    t=s+100*(j-1);
                    System.out.print("今天是周"+j+"，跑了 "+t+" 米。");
                    sum+=t;
                    System.out.println("打卡第 "+((i-1)*7+j)+" 天，一共跑了 "+sum+" 米。");
                }
            }
        }
        System.out.println("   李四 "+n+" 天后一共跑了 "+sum+" 米。");

    }
}
