package day4_810.exercise;

public class Exercise4Perfect {
    public static void main(String[] args) {
        perfectNumber();
    }
    public static void perfectNumber(){
        int i = 1;
        while (true) {
            int sum=0;
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    sum+=j;

                }
            }
            if(sum==i){
                System.out.println(i+" 是完美数：");
                System.out.print(i+"=1");
                for (int k=2;k<i;k++){
                    if(i%k==0){
                        System.out.print("+"+k);
                    }
                }
                System.out.println();
            }
            i++;
        }
    }
}
