import java.util.Scanner;
public class Swich01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        //year%4==0&&year%4!=0 ||year%400==0
        switch (month) {
            case 1, 3, 5, 7, 9, 10, 12:
                System.out.println("这个月31天");
                break;
            case 4, 6, 8, 11:
                System.out.println("这个月30天");
                break;
            case 2:
                if (year % 4 == 0 && year % 4 != 0 || year % 400 == 0) {
                    System.out.println("这个月29天");
                } else {
                    System.out.println("这个月28天");
                    break;
                }
            default:
                System.out.println("你输入的月份不合理");
                break;
        }
    }
}
