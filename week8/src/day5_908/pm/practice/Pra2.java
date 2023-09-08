package day5_908.pm.practice;

import java.util.HashMap;
import java.util.Scanner;
/**
 * @author Administrator
 */
public class Pra2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();
        System.out.println("===HashMap的compute()===");
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            hashMap.compute(c, (key, value) -> value==null?1:value+1);
        }
        System.out.println(hashMap);
        System.out.println("===HashMap的put()===");
        HashMap<Character,Integer> hashMap1=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            Integer value = hashMap1.get(c);
            if(value!=null){
                hashMap1.put(c,value+1);
            }else{
                hashMap1.put(c,1);
            }
        }
        System.out.println(hashMap1);
    }
}
