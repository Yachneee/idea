package day3_809;

public class SortMp {
    public static void main(String[] args) {
        int[] a={3,38,5,44,15,36,26,27,2,46,47,4,19,50,48};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    a[j]=a[j]^a[j+1];
                    a[j+1]=a[j]^a[j+1];
                    a[j]=a[j]^a[j+1];
                }
            }
        }
        for (int arr : a) {
            System.out.print(arr+"\t");
        }
    }
}
