package day4_824;

/**
 * @author Administrator
 */
public class ValidBracket {
    public static boolean valBra(String str){
        String bra1="()";
        String bra2="[]";
        String bra3="{}";
        String bra4="（）";
        String bra5="【】";
        while(str.contains(bra1)||str.contains(bra2)||str.contains(bra3)||str.contains(bra4)||str.contains(bra5)){
            str=str.replace(bra1,"").replace(bra2,"").replace(bra3,"").replace(bra4,"").replace(bra5,"");
        }
        return str.isBlank();
    }

    public static void main(String[] args) {
        String str="[{}}(){{}]";
        System.out.printf("字符串 %s %s是有效的",str,valBra(str)?"":"不");
    }
}
