package day2_829.pract;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strings={"flower", "flow", "flight"};
        System.out.println(commonPre(strings));
        String[] strings1= {"dog", "racecar", "car"};
        System.out.println(commonPre(strings1));
        String[] strings2= {"apple", "appetite", "applicable"};
        System.out.println(commonPre(strings2));
    }
//        编写一个函数，接受一个字符串数组作为输入，返回这些字符串的最长公共前缀。

    /**
     * 找字符串数组的最长公共前缀
     * @param strings 字符串数组
     * @return 最长公共前缀
     */
    public static String commonPre(String[] strings){
        if(strings.length==0){
            return null;
        }
        String str="";
        outer:for (int i = 0; i < strings[0].length(); i++) {
            boolean con=true;
            char c=strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                if(strings[j].charAt(i)!=c){
                    con=false;
                }
                if(!con){
                    break outer;
                }
            }
            str+=c;
        }
        return "\""+str+"\"";
    }
}
