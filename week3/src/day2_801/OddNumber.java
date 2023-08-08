package day2_801;

import java.util.Scanner;
public class OddNumber{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("������һ�����֣�");
	int num = input.nextInt();
     	//ģ2��1	
        boolean res= num % 2 == 1;
	System.out.println("�����������"+num+"��������" +res);
	input.close();
	}
}