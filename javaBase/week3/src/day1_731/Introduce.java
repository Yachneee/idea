package day1_731;

import java.util.Scanner;
public class Introduce{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("����������");
	String name = input.next();
	System.out.println("�������Ա�");
	String gender = input.next();
	System.out.println("����������");
	int age = input.nextInt();
	System.out.println("���������");
	double height = input.nextDouble();
	//������ҽ���
	System.out.println("��������Ϣ��");
	System.out.print("����: "+name);
	System.out.print("  ");
	System.out.println("�Ա�: "+gender);
	System.out.print("����: "+age);
	System.out.print("��  ");
	System.out.print("���:  "+height);
	System.out.print("m  ");
	input.close();
	}
}