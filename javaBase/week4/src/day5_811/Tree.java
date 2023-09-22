package day5_811;

import java.util.Random;
import java.util.Scanner;

public class Tree {
    static int grow = 11;
    /** 树初始成长值，当成长值 归零或小于0时，树死亡 */
    static int count=1;
    static int prevGrow=0;
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);
        // 获取操作次数
        System.out.print("请输入操作次数：");
        int n=sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            // 生成随机数
            int type = rand.nextInt(4) + 1;
            System.out.println("第"+(i+1)+"次进行:"+type);
            // 分支 按照type执行不同的方法
            switch(type){
                case 1: water();
                break;
                case 2: cut();
                break;
                case 3: fertilize();
                break;
                default: worms();
            }
            if(grow<=0){
                System.out.println("Game over! 你的树死啦！");
                break;
            }
        }
        if(grow>0) {
            System.out.println("操作 " + n + " 次后，你的树最终成长值为：" + grow);
        }

    }
    /**
     浇水，每浇一次水成长值 +10
     */
    public static void water(){
        grow+=10;
        System.out.println("wonderful!! finish water,成长值+10,当前树的成长值为："+grow);
    }

    /**
     修剪树，每修剪一次成长值 +5
     */
    public static void cut(){
        grow+=5;
        System.out.println("good! finish cut,成长值+5,当前树的成长值为："+grow);
    }

    /**
     打药，每打药一次成长值 +20
     */
    public static void fertilize(){
        grow+=20;
        System.out.println("brilliant!!! get fertilize,成长值+20,当前树的成长值为："+grow);
    }

    /**
     生虫，每生虫一次成长值 -10
     连续生虫三次，生长值额外 - 20
     */
    public static void worms(){
        if(grow == prevGrow) {
            count++;
        }else{
            count=1;
        }
        if(count%3==0){
            grow-=30;
            System.out.println("Very bad!! 连续 3 次生虫, 成长值-10 -20,剩余成长值："+grow);
        }else{
            grow-=10;
            System.out.println("Bad! 第 "+count+" 次生虫, 成长值-10,剩余成长值："+grow);
        }
        prevGrow=grow;
    }
}
