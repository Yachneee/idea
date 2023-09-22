package day3_823;

/**
 * @author Administrator
 */
public class BlurConstant {
    public static void main(String[] args) {
//        String a="a";
//        String str1= a + "bc";
//        String s1=str1.intern();
//        String s2="abc";
//        System.out.println(str1==s1);
//        System.out.println(s1==s2);
//        System.out.println(str1==s2);
//        String text = """
//                   序号 姓名
//                   1 张三
//                   "snadnlasmkl"
//                   """;
//        System.out.println(text);
//        String a="a";
//        String str1= a + "bc";
//        String s2="abc";
//        String s1=str1.intern();
//        System.out.println(str1==s1);
//        System.out.println(s1==s2);
//        System.out.println(str1==s2);
//        String a="a";
//        String str= "abc";
//        String s=new String("abc");
//        String s1=s.intern();
//        System.out.println(s==s1);
//        System.out.println(s1==str);
//        System.out.println(s==str);
        String s=new String("abc");
        String s1=s.intern();
        String str= "abc";
        System.out.println(s==s1);  //false
        System.out.println(s1==str);//true
        System.out.println(s==str); //false
    }
}
