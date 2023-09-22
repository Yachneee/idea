package day5_818;

public class Calculator {
    public static int primeSum(int num){
        int sum=0;
        for (int i = 2; i <= num; i++) {
            boolean p=true;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }
            if(p){
                sum+=i;
            }
        }
        return sum;
    }
    public static void insertSort(int[] arr){
        //升序
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int prevIndex=i-1;
            for (; prevIndex >= 0 && arr[prevIndex]>current ; prevIndex--) {
                arr[prevIndex+1]=arr[prevIndex];
            }
            arr[prevIndex+1]=current;
        }
    }
    public static int binarySearch(int[] arr,int num){
        //升序
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num<arr[mid]){
                end=mid-1;
            }else if(num>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
