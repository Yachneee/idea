public class Rhomb02 {
    public static void main(String[] args) {
        // 画个菱形
        for(int i=1;i<=13;i++){
            if(i<=7){
                for (int j=0;j<7-i;j++){
                    System.out.print("  ");
                }
                for (int j=0;j<2*i-1;j++){
                    System.out.print("* ");
                }
            }else {
                for (int j=0;j<i-7;j++) {
                    System.out.print("  ");
                }
                for (int j=0;j<2*(14-i)-1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

