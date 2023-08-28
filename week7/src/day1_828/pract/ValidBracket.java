package day1_828.pract;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class ValidBracket {
    //编写一个函数，接受一个包含括号字符的字符串，判断括号是否匹配有效。例如，"()[]{}" 是有效的，但 "(]" 是无效的。

    /**
     * 判断括号是否匹配有效
     * @param str 要判断的字符串
     * @return 有效返回true，无效返回false
     */
    public static boolean validBra(String str){
        if(str.length()==0){
            return false;
        }
        if(str.contains("()")||str.contains("[]")||str.contains("{}")||str.contains("【】")||str.contains("（）")){
            str=str.replace("()","");
            str=str.replace("[]","");
            str=str.replace("{}","");
            str=str.replace("【】","");
            str=str.replace("（）","");
            return str.isEmpty() || str.isBlank();
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个只包含括号的字符串：");
        String str=sc.nextLine();
        System.out.printf("%s %s是有效的",str,(validBra(str)?"":"不"));
    }
}
