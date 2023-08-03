public class Rhomb01 {
    public static void main(String[] args) {
        // 画个菱形
        for(int i=1;i<=11;i++){
            System.out.print(" ");
        }
        System.out.println("*");
        for(int i=1;i<=11;i++){
            if(i<=6){
                for (int j=0;j<2*(6-i);j++){
                    System.out.print(" ");
                }
                for (int j=0;j<2*i;j++){
                    System.out.print("* ");
                }
            }else {
                for (int j = 0; j < i - 6; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * (12 - i); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=11;i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}