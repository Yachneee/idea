package exam;

/**
 * @author Administrator
 */
public class Test1 {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
        s="  hello1  world  ";
        System.out.println(reverseWords(s));
        s="a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s){
        StringBuilder str= new StringBuilder();
        s=s.strip();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                s=s.replace(c,' ');
            }
        }
        int end=s.length();
        int index=s.lastIndexOf(" ");
        while(index!=-1){
            str.append(s, index + 1, end).append(" ");
            end=index;
            while(s.charAt(end-1)==' '){
                end--;
            }
            index=s.lastIndexOf(" ",end-1);
        }
        if(s.contains(" ")){
            str.append(s, 0, s.indexOf(" "));
        }else{
            str.append(s);
        }

        return str.toString();
    }
}
