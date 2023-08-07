public class ClassPract {
    public static void main(String[] args) {

        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        int a_copy[]=new int[10];
        for (int n = 0; n < a.length; n++) {
            if(n==0){
                a_copy[n]=a[n]*a[n+1];

            }else if(n==9){
                a_copy[n]=a[n-1]*a[n];

            }else{
                a_copy[n]=a[n-1]*a[n]*a[n+1];

            }
        }
        for (int n = 0; n < a.length; n++) {
            System.out.print(a[n]+"\t");
        }
        System.out.println();
        for (int n = 0; n < a.length; n++) {
            System.out.print(a_copy[n]+"\t");
        }
    }
}
