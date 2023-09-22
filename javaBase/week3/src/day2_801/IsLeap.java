package day2_801;//��������һ����ݣ��ж��Ƿ�������
import java.util.Scanner;
public class IsLeap{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("��������ݣ�");
	int year = input.nextInt();
     	//�ܱ�4���������ܱ�100���������߱�400����
        boolean res= year%4==0 && year%100!=0 || year%400==0 ;
	System.out.println("����������"+year+"��������" +res);
	input.close();
	}
}