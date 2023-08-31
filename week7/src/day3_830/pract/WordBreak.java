package day3_830.pract;

/**
 * @author Administrator
 */
public class WordBreak {
    public static boolean wordBreak(String s, String[] wordDict) {
//        给定一个非空字符串和一个包含非空单词列表的字典，编写一个函数来确定字符串是否可以被空格拆分为一个或多个 字典中的单词。
        for (String now : wordDict) {
            while (s.contains(now)) {
                int index1 = s.indexOf(now);
                int index2 = index1 + now.length();
                s = s.substring(0, index1) + s.substring(index2);
            }
        }
        return s.isEmpty()||s.isBlank();
    }
    public static void main(String[] args) {
        String string="hellocodecodenotsleep";
        String[] wordDict= {"hello","sleep","code","hi","not"};
        System.out.println(wordBreak(string, wordDict));
        // 输出: true
    }
}

