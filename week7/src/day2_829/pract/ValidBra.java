package day2_829.pract;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class ValidBra {
    //编写一个函数，接受一个包含括号字符的字符串，判断括号是否匹配有效。例如，"()[]{}" 是有效的，但 "(]" 是无效的。

    /**
     * 判断字符串，给定类型括号匹配是否是有效的
     * @param str 要判断的字符串
     * @param left 左括号
     * @param right 和left同类型的右括号
     * @return 如果left，right匹配，返回true，否则返回false
     */
    public static boolean validBra(String str,char left,char right){
        if(str==null){
            return false;
        }else if(str.isEmpty()||str.isBlank()){
            return true;
        }
        char[] chars=new char[str.length()];
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c==left){
                chars[count++]=c;
            }else if(c==right){
                if(count==0){
                    return false;
                }
                if(chars[count-1]==left){
                    chars[--count]=' ';
                }
            }
        }
        return count==0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个包含括号的字符串：");
        String str=sc.nextLine();
//        boolean t1=validBra(str,'(',')');
//        boolean t2=validBra(str,'[',']');
//        boolean t3=validBra(str,'{','}');
//        boolean t4=validBra(str,'【','】');
//        boolean t5=validBra(str,'（','）');
        boolean isVa=validBra(str,'(',')')&&validBra(str,'[',']')
                &&validBra(str,'{','}')&&validBra(str,'【','】')
                &&validBra(str,'（','）');
        System.out.printf("%s 中的括号匹配 %s 有效的！",str,(isVa?"是":"不是"));
    }
}
