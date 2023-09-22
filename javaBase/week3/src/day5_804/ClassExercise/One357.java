public class One357 {
    public static void main(String[] args) {
        //打印100以内除了尾数为3,5,7的所有数
        System.out.println("100以内除了尾数为3，5，7的所有数有：");
        for(int i=0;i<=100;i++){
            if(i%10==3||i%10==5||i%10==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
