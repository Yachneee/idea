package day2_801;

import java.util.Scanner;
public class Telephone{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("�������ֻ��ߴ磺");
	double size=input.nextDouble();
	System.out.println("�������ֻ��ڴ棺");
	double storage=input.nextDouble();
	//����1��Ҫ���ֻ���������ߴ���ڵ���6.95�����ڴ������ڵ���8
        boolean res1= size >= 6.95 && storage >= 8;
	//����2��Ҫ���ֻ�Ҫô����ߴ���ڵ���6.95��Ҫô�ڴ������ڵ���8
        boolean res2= size >= 6.95 || storage >= 8;
	System.out.println("����1��" +res1);
	System.out.println("����2��" +res2);
	input.close();
	}
}