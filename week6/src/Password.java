import java.util.*;
public class Password{
    public static String pass(int n){
        Random r=new Random();
        String str="";
        for(int i=0;i<n;i++){
            int type=r.nextInt(3);
            if(i==0){
                type=r.nextInt(2);
            }
            char c=switch(type){
                case 0->(char)(r.nextInt(26)+65);
                case 1->(char)(r.nextInt(26)+97);
                default ->(char)(r.nextInt(10)+48);
            };
            if(str.indexOf(c)==-1){
                str+=c;
            }else{
                i--;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入密码位数：");
        int n=sc.nextInt();
        System.out.println("生成的"+n+"密码："+pass(n));
    }
}