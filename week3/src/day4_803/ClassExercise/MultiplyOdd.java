public class MultiplyOdd {
    public static void main(String[] args) {
        int i=10;
        int mul=1;
        while(i>0){
            if(i%2==1){
                mul*=i;
                System.out.println(i+"  "+mul);
            }
            i--;
        }
        System.out.println("10到1之间所有奇数的乘积："+mul);
    }
}