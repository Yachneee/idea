package exam;

import java.util.HashMap;
import java.util.function.BiFunction;

/**
 * @author Administrator
 */
public class Test2 {
    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        System.out.println(judge(str1, str2));
        str1="rat";
        str2="car";
        System.out.println(judge(str1,str2));
    }
    public static boolean judge(String str1,String str2){
        if(str1.equals(str2)||str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer> hashMap1=strInMap(str1);
        HashMap<Character,Integer> hashMap2=strInMap(str2);
        return hashMap1.equals(hashMap2);
    }
    private static HashMap<Character,Integer> strInMap(String str){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            hashMap.compute(c, (key, value) -> value==null?1:value+1);
        }
        return hashMap;
    }
}
