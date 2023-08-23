package day3_823;

/**
 * @author Administrator
 */
public class BlurConstant {
    public static void main(String[] args) {
        String a="a";
        String str1= a + "bc";
        String s1=str1.intern();
        String s2="abc";
        System.out.println(str1==s1);
        System.out.println(s1==s2);
        System.out.println(str1==s2);

//        String a="a";
//        String str1= a + "bc";
//        String s1=str1.intern();
//        String s2="abc";
//        System.out.println(str1==s1);
//        System.out.println(s1==s2);
//        System.out.println(str1==s2);
    }
}
