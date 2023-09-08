package day4_907.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class PokeRoom {
    private ArrayList a=new ArrayList();
    private ArrayList b=new ArrayList();
    private ArrayList c=new ArrayList();
    private ArrayList table=new ArrayList();
    private ArrayList diZhu=new ArrayList();
    private Scanner sc=new Scanner(System.in);
    private Random r=new Random();
    public PokeRoom(){
        System.out.println("=========欢迎来到开发喵牌室==========");
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] type={"♠","♥","♣","♦"};
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card card=new Card(numbers[i],type[j],i);
                table.add(card);
            }
        }
        Card c1=new Card("","🧚‍♀",50);
        Card c2=new Card("","️️🧙‍♀",100);
        Collections.addAll(table,c1,c2);
    }
    public void washCard(){
        Collections.shuffle(table);
    }
    public void distributeCard(){
        for (int i = 0; i < table.size()-3; i++) {
            Card card=(Card) table.get(i);
            if(i%3==0){
                a.add(card);
            }else if(i%3==1){
                b.add(card);
            }else{
                c.add(card);
            }
        }
//        a.addAll(table.subList(0,17));
//        b.addAll(table.subList(17,34));
//        c.addAll(table.subList(34,51));
        diZhu.addAll(table.subList(51,table.size()));
    }
    public void sortCard(){
        Collections.sort(a);
        Collections.sort(b);
        Collections.sort(c);
        Collections.sort(diZhu);
    }
    public void showCard(int i){
        System.out.println((i+1)+"号玩家，您的牌有"+isWho(i).size()+"张，分别是："+isWho(i));
    }

    /**
     * 叫地主+抢地主
     * @return 三个都是false时，返回false,其它返回true
     */
    public boolean getDiZhu(){
        int d=r.nextInt(3)+1;
        boolean[] dz=new boolean[3];
        System.out.print((d)+"号是否叫地主(0/1)？：");
        int get1 = sc.nextInt();
        if(get1==1){
            dz[d-1]=true;
            for (int i = 1; i <= 3; i++) {
                int j=(d+i)%3;
                j=j==0?3:j;
                System.out.print(j+"号是否抢地主(0/1)？：");
                int snatch = sc.nextInt();
                dz[j-1]=(snatch==1);
            }
        }else {
            dz[d-1]=false;
            System.out.print((d%3+1)+"号是否叫地主(0/1)？：");
            int get2 = sc.nextInt();
            if(get2==1){
                dz[d%3]=true;
                for (int i = 1; i <= 3; i++) {
                    int j=(d%3+i+1)%3;
                    j=j==0?3:j;
                    if(j==d){
                        continue;
                    }
                    System.out.print(j+"号是否抢地主(0/1)？：");
                    int snatch = sc.nextInt();
                    dz[j-1]=(snatch==1);
                    if(!dz[j-1]){
                        break;
                    }
                }
            }else{
                dz[d%3]=false;
                int j=(d%3+2)%3;
                j=j==0?3:j;
                System.out.print(j+"号是否叫地主(0/1)？：");
                int get3 = sc.nextInt();
                dz[j-1]=(get3==1);
            }
        }
        if (dz[d-1]) {
            System.out.println("底牌:"+diZhu);
            isWho(d-1).addAll(diZhu);
            sortCard();
            showCard(d-1);
        } else if (dz[d%3]) {
            System.out.println("底牌:"+diZhu);
            isWho(d%3).addAll(diZhu);
            sortCard();
            showCard(d%3);
        } else if (dz[(d+1)%3]) {
            System.out.println("底牌:"+diZhu);
            isWho((d+1)%3).addAll(diZhu);
            sortCard();
            showCard((d+1)%3);
        }else{
            return false;
        }
        return true;
    }
    private ArrayList isWho(int i){
        return switch (i){
            case 0->a;
            case 1->b;
            default -> c;
        };
    }
    public void startGame(){
        washCard();
        System.out.println("洗牌完成！");
        distributeCard();
        System.out.println("发牌完成！");
        while (true){
            System.out.println("1.看牌");
            System.out.println("2.捋牌");
            System.out.println("3.抢地主");
            System.out.println("0.退出游戏");
            System.out.print("请输入操作数：");
            int type = sc.nextInt();
            switch (type){
                case 1->{
                    showCard(0);
                    showCard(1);
                    showCard(2);
                }
                case 2->{
                    sortCard();
                    System.out.println("捋牌完成！");
                }
                case 3->{
                    System.out.println("开始抢地主");
                    if(getDiZhu()){
                        System.out.println("抢地主结束，游戏正式开始！");
                        System.exit(1);
                    }else{
                        System.out.println("抢地主失败，重新洗牌！");
                        startGame();
                    }
                }
                default -> System.exit(1);
            }
        }
    }
}
