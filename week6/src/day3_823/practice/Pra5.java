package day3_823.practice;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Pra5 {
    /**
     * 定义一个用于截取文件后缀名的方法, 传入一个字符串的文件名( hello.java),返回一个字符串。
     * @param fileName 文件名
     * @return 文件后缀
     */
    public static String fileSuffix(String fileName){
        int index=fileName.lastIndexOf('.');
        return fileName.substring(index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入文件名：");
        String fileName = sc.next();
//      String fileName="hello.java";
        System.out.printf("文件 %s 的后缀名是：%s",fileName,fileSuffix(fileName));
    }
}
