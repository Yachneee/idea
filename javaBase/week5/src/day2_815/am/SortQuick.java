package day2_815.am;

import java.util.Arrays;

public class SortQuick {
    public static void main(String[] args) {
        int[] arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int benchmark=arr[left];
        int i=left;
        int j=right;
        while(i<j){
            // 从右向左找到比基准小的值
            while(i<j && arr[j]>=benchmark){
                j--;
            }
            // 从左向右找到比基准大的值
            while(i<j && arr[i]<=benchmark){
                i++;
            }
            if(i<j){
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
            }
        }
        arr[left]=arr[i];
        arr[i]=benchmark;
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
}
