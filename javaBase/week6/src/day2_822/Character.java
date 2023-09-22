package day2_822;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class Character {
    public static void main(String[] args) {
        String str="ni hao shi jie";
        System.out.println(str.charAt(5));
        // o
        String str1="ni hao!";
        System.out.println(str.compareTo(str1));
        //-1
        String str2="Ni Hao!";
        System.out.println(str1.compareToIgnoreCase(str2));
        //0
        String str3="Shi Jie!";
        System.out.println(str2.concat(str3));
        //Ni Hao!Shi Jie!
        System.out.println(str3.contains("i j"));
        //false
        char[] date = {'2', '/', '3', '/'};
        String str4 = String.copyValueOf(date);
        System.out.println(str4);
        // 2/3/
        String str5 = String.copyValueOf(date, 1, 3);
        System.out.println(str5);
        //   /3/
        String str6 = "Hello World";
        boolean endsWith = str6.endsWith("World");
        System.out.println(endsWith);
        // true
        String str7="Hello World";
        System.out.println(str6.equals(str7)); // true
        str7="Hello world";
        System.out.println(str6.equals(str7)); //false
        System.out.println(str6.equalsIgnoreCase(str7)); //true
        String name = "John";
        int age = 25;
        String message = String.format("My name is %s, and I am %d years old.", name, age);
        System.out.println(message);
        // My name is John, and I am 25 years old.
        String fo="My name is %s, and I am %d years old.";
        String name1 = "Bob";
        int age2 = 20;
        System.out.println(fo.formatted(name1, age2,age2));
        //My name is Bob, and I am 20 years old.
        byte[] bytes=str7.getBytes();
        System.out.println(Arrays.toString(bytes));
        // [72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100]
        byte[] bytes1=new byte[10];
        str7.getBytes(2, 5, bytes1,0);
        System.out.println(Arrays.toString(bytes1));
        //[108, 108, 111, 0, 0, 0, 0, 0, 0, 0]
    }
}
