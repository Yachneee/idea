import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，
        // 请完成上述过程并计算出选手的得分。
        Scanner sc=new Scanner(System.in);
        int[] a=new int[6];
        for (int i = 0; i < a.length; i++) {
            System.out.print("请输入第 "+(i+1)+" 个评委打的分数：");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int maxIndex=0;
        int min=a[0];
        int minIndex=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
                maxIndex=i;
            }
            if(a[i]<min){
                min=a[i];
                minIndex=i;
            }
        }
        System.out.println("最高分为 "+max+" 是第 "+(maxIndex+1)+" 个评委打的");
        System.out.println("最低分为 "+min+" 是第 "+(minIndex+1)+" 个评委打的");
        int sum=0;
        double avg=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=max && a[i]!=min){
                sum+=a[i];
            }
        }
        avg=sum/4;
        System.out.println("去掉最高分、最低分后的4个评委的平均分为："+avg);
    }
}
