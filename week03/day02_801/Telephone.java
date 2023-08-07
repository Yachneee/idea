import java.util.Scanner;
public class Telephone{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入手机尺寸：");
	double size=input.nextDouble();
	System.out.println("请输入手机内存：");
	double storage=input.nextDouble();
	//需求1：要求手机必须满足尺寸大于等于6.95，且内存必须大于等于8
        boolean res1= size >= 6.95 && storage >= 8;
	//需求2：要求手机要么满足尺寸大于等于6.95，要么内存必须大于等于8
        boolean res2= size >= 6.95 || storage >= 8;
	System.out.println("需求1：" +res1);
	System.out.println("需求2：" +res2);
	input.close();
	}
}