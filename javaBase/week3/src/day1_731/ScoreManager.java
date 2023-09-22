package day1_731;

import java.util.Scanner;
public class ScoreManager{
       public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("������ѧ������");
	String name = input.next();
	System.out.println("������java�ɼ�");
	int javaScore = input.nextInt();
	System.out.println("������python�ɼ�");
	int pythonScore = input.nextInt();
	input.close();

	//����ɼ�
	System.out.println("ѧ�������ǣ�" + name);
	System.out.println("ѧ��java�ɼ��ǣ�" + javaScore);
	System.out.println("ѧ��python�ɼ��ǣ�" + pythonScore);
      	}
}