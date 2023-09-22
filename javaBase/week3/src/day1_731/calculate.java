package day1_731;

public class calculate{
    public static void main(String[] args){
        System.out.println("??o?");
        int money=0;
        //����20Ԫ
        money = money + 20;
        //�ٴ�ӡmoney��¼��ֵ�Ƕ���
        System.out.println(money); // 108.8
        // �ٱ��磺����������2Ԫ��С��һԪ������������2վ
        // ��һվ��3������1��С���ϳ� 3 * 2 + 1
        // �ڶ�վ��1������1��С���ϳ� 1 * 2 + 1
        // ����һ�����˶����ˣ�һ���������Ǯ��
        //  �տ�ʼ������������û��Ǯ����money2��ʾ�������Ǯ
        int money2 = 0;
        //�տ�ʼ��������Ҳû���ˣ���count������ʾ�ϳ�������
        int count = 0;
        //������վ����������һվ3�ˣ��ڶ�վ1�ˣ��ܵ�������3+1
        count = 3 + 1;
        count = count + 1 + 1;
        //������վ��Ǯ����
        money2 = money2+ 3*2+1; // ������һվ��
        money2 = money2+2+1; // �����ڶ�վ��
        // ��ӡ������Ǯ��
        System.out.println(count); // 6
        System.out.println(money); // 10
    }
}