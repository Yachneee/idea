package day1_828.pract;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class IpLocal {
    //给定一个只包含数字的字符串，编写一个函数来复原所有可能的 IP 地址组合。
    //你需要将给定的数字字符串拆分成符合 IP 地址规则的各个部分。IP 地址由四个由点分隔的整数组成，每个整数的取值范围为 0 到 255。

    public static String[] localIp(String str){
        String[] strs=new String[5];
        int count=0;
        String newStr;
        for (int i = 1; i < str.length(); i++) {
            String strFirst=str.substring(0,i);
            int first=Integer.parseInt(strFirst);
            if(strFirst.length()!=String.valueOf(first).length()){
                continue;
            }
            newStr=strFirst+".";
            int length1=newStr.length();
            String str1=str.substring(i);
            for(int j=1;j<str1.length();j++){
                String strSecond=str1.substring(0,j);
                int second=Integer.parseInt(strSecond);
                if(strSecond.length()!=String.valueOf(second).length()){
                    continue;
                }
                newStr+=strSecond+".";
                String str2=str1.substring(j);
                int length2=newStr.length();
                for (int k = 1; k < str2.length(); k++) {
                    String strThird=str2.substring(0,k);
                    int third=Integer.parseInt(strThird);
                    if(strThird.length()!=String.valueOf(third).length()){
                        continue;
                    }
                    newStr+=strThird+".";
                    String str3=str2.substring(k);
                    newStr+=str3;
                    if(str3.length()<4&&isValid(newStr)){
                        strs[count++]=newStr;
                    }
                    newStr=newStr.substring(0,length2);
                }
                newStr=newStr.substring(0,length1);
            }
        }
        return strs;
    }
    public static boolean isValid(String str){
        String[] strs = str.split("\\.");
        for (int i = strs.length-1; i >=0; i--) {
            if(strs[i].length()>4){
                return false;
            }
            int n=Integer.parseInt(strs[i]);
            if (n>255){
                return false;
            }if(strs[i].length()!=String.valueOf(n).length()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="010010";
        System.out.println(Arrays.toString(localIp(str)));
    }
}
