public class ForMultiple7 {
    public static void main(String[] args) {
        System.out.println("200前7的倍数有：");
        for(int i=1;i<=200;i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
        //for(int i=7;i<200;i+=7){
        //System.out.println(i);
        //}
    }
}
