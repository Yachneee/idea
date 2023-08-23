package day3_823.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Pra2 {
    /**
     * 使用String来开发验证码。需求如下：
     * 实现随机产生验证码，验证码的每位可能是数字、大写字母、小写字母。
     * 随机产生的验证码
     * @param place 验证码位数
     * @return 随机产生的验证码
     */
    public static String randomStr(int place){
        Random r=new Random();
        char[] chars=new char[place];
        for (int i = 0; i < place; i++) {
            int type=r.nextInt(3);
            int num=-1;
            switch (type){
                case 0-> num=r.nextInt(10)+48;
                // 数字 48~57,65~90,97~122
                case 1-> num=r.nextInt(26)+65;
                // 大写字母 65~90
                case 2-> num=r.nextInt(26)+97;
                // 小写字母 97~122
            }
            chars[i]=(char)num;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入验证码位数：");
        int place=sc.nextInt();
        System.out.printf("随机生成的%d验证码为%s",place,randomStr(place));
    }
}
