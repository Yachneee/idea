public class Three {
    public static void main(String[] args) {
        System.out.print("水仙花数有：");
        int num=100;
        while(num<=999){
            int a=num/100;
            int b=num/10%10;
            int c=num%10;
            if(a*a*a+b*b*b+c*c*c==num){
                System.out.print(num+"   ");
            }
            num++;
        }
    }
}