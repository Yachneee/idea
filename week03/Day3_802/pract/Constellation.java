package pract;

import java.util.Scanner;

public class Constellation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //编写一个程序，根据用户输入的月份和日期，输出该日期所在的星座。
        System.out.println("请输入月份和日期：");
        int mon = sc.nextInt();
        int d = sc.nextInt();
        String result = null;
        int i=0;
        switch (mon) {
            case 1-> {
                if (d>=20 && d<=31){
                    result="水瓶座";
                } else if (d>=1 && d<=19) {
                    result="魔羯座";
                }
            }
            case 2-> {
                if (d>=19 && d<=29){
                    result="双鱼座";
                } else if (d>=1 && d<=18) {
                    result="水瓶座";
                }
            }
            case 3-> {
                if (d>=21 && d<=31){
                    result="白羊座";
                } else if (d>=1 && d<=20) {
                    result="双鱼座";
                }
            }
            case 4-> {
                if (d>=20 && d<=30){
                    result="金牛座";
                } else if (d>=1 && d<=19) {
                    result="白羊座";
                }
            }
            case 5-> {
                if (d>=21 && d<=31){
                    result="双子座";
                } else if (d>=1 && d<=20) {
                    result="金牛座";
                }
            }
            case 6-> {
                if (d>=21 && d<=30){
                    result="巨蟹座";
                } else if (d>=1 && d<=20) {
                    result="双子座";
                }
            }
            case 7-> {
                if (d>=23 && d<=31){
                    result="狮子座";
                } else if (d>=1 && d<=22) {
                    result="巨蟹座";
                }
            }
            case 8-> {
                if (d>=23 && d<=31){
                    result="处女座";
                } else if (d>=1 && d<=22) {
                    result="狮子座";
                }
            }
            case 9-> {
                if (d>=23 && d<=30){
                    result="天秤座";
                } else if (d>=1 && d<=22) {
                    result="处女座";
                }
            }
            case 10-> {
                if (d>=23 && d<=31){
                    result="天蝎座";
                } else if (d>=1 && d<=22) {
                    result="天秤座";
                }
            }
            case 11-> {
                if (d>=22 && d<=30){
                    result="射手座";
                } else if (d>=1 && d<=21) {
                    result="天蝎座";
                }
            }
            case 12-> {
                if (d>=22 && d<=31){
                    result="魔羯座";
                } else if (d>=1 && d<=21) {
                    result="射手座";
                }
            }
            default-> i=1;
        }
        if(i==0){
            System.out.println("你输入的日期所在的星座为："+result);
        }else {
            System.out.println("你输入的日期有误*n*");
        }
        sc.close();
    }
}