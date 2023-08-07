//键盘输入一个年份，判断是否是闰年
import java.util.Scanner;
public class IsLeap{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入年份：");
	int year = input.nextInt();
     	//能被4整除但不能被100整除，或者被400整除
        boolean res= year%4==0 && year%100!=0 || year%400==0 ;
	System.out.println("您输入的年份"+year+"是闰年吗？" +res);
	input.close();
	}
}