import java.util.Scanner;
public class OddNumber{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个数字：");
	int num = input.nextInt();
     	//模2余1	
        boolean res= num % 2 == 1;
	System.out.println("您输入的数字"+num+"是奇数吗？" +res);
	input.close();
	}
}