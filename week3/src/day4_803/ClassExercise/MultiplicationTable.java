public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("九九乘法口诀表：");
        int mul=1;
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                mul=i*j;
                System.out.print(j+"*"+i+"="+mul);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
