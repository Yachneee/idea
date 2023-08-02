public class calculate{
public static void main(String[] args){
System.out.println("ÄãºÃ");
int money=0;
//再收20元
money = money + 20;
//再打印money记录的值是多少
System.out.println(money); // 108.8
// 再比如：公交车大人2元，小孩一元，公交车经过2站
// 第一站：3个大人1个小孩上车 3 * 2 + 1
// 第二站：1个大人1个小孩上车 1 * 2 + 1
// 请问一共上了多少人，一共收入多少钱？
// 刚开始公交车箱子里没有钱，用money2表示箱子里的钱
int money2 = 0;
//刚开始公交车上也没有人，用count变量表示上车的人数
int count = 0;
//经过两站的人数：第一站3人，第二站1人，总的人数是3+1
count = 3 + 1;
count = count + 1 + 1;
//经过两站的钱数：
money2 = money2+ 3*2+1; // 经过第一站后
money2 = money2+2+1; // 经过第二站后
// 打印人数和钱数
System.out.println(count); // 6
System.out.println(money); // 10
}
}