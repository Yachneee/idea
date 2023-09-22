public class ChrismasTree {
    public static void main(String[] args) {
        // 画个圣诞树
        for(int i=1;i<=4;i++){
            for(int j=0;j<6-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++){
            for(int j=0;j<4-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*(i+1)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++){
            for(int j=0;j<3-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*(i+2)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=0;j<3;j++){
                System.out.print("  ");
            }
            for(int j=0;j<11-2*3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
