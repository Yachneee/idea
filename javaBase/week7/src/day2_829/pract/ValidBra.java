package day2_829.pract;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class ValidBra {
    //编写一个函数，接受一个包含括号字符的字符串，判断括号是否匹配有效。例如，"()[]{}" 是有效的，但 "(]" 是无效的。([)]无效

    /**
     * 判断字符串，给定类型括号匹配是否是有效的
     * @param str 要判断的字符串
     * @return 如果括号匹配，返回true，否则返回false
     */
    public static boolean validBra(String str){
        if(str==null){
            return false;
        } else if (str.isEmpty()||str.isBlank()) {
            return true;
        }
        char[] chars=new char[str.length()];
        int index=-1;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c=='('||c=='['||c=='{'){
                chars[++index]=c;
            } else if (c==')'||c==']'||c=='}') {
                if(index==-1||chars[index]!=findLeft(c)){
                    return false;
                }else{
                    index--;
                }
            }
        }
        return index==-1;
    }
    public static char findLeft(char c){
        return switch (c){
            case ')'-> '(';
            case ']'-> '[';
            default -> '{';
        };
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个包含括号的字符串：");
        String str=sc.nextLine();
        System.out.printf("%s 中的括号匹配 %s 有效的！",str,(validBra(str)?"是":"不是"));
    }
}
