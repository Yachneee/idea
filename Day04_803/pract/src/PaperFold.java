import java.util.Scanner;

public class PaperFold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 世界最高峰珠穆朗玛峰高度是：8848.86米，假如我有一张足够大的
        double a=0.1;
        int i=0;
        while(a<=8848860){
            a*=2;
            i++;
        }
        System.out.println(i);
    }
}