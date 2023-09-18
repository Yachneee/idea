package day1_918.Exercise;

import java.util.*;

/**
 * @author Administrator
 */

public class Exe3 {
    public static void main(String[] args) {
        Random r=new Random();
        int size=100;
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=r.nextInt(size);
        }
        Thread thread1=new Thread(()->sortPart(arr,0,size/3));
        Thread thread2=new Thread(()->sortPart(arr,size/3,(size/3)*2));
        Thread thread3=new Thread(()->sortPart(arr,(size/3)*2,size));
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
            if((i+1)%(size/3)==0){
                System.out.println();
            }
        }
    }
    public static void sortPart(int[] arr,int start,int end){
        System.out.println("选择排序");
        for (int i = start; i <end; i++) {
            int current=arr[i];
            int min=i;
            for (int j = i+1; j <end ; j++) {
                min=arr[min]<arr[j]?min:j;
            }
            arr[i]=arr[min];
            arr[min]=current;
        }
//        int[] array=new int[end-start];
//        System.arraycopy(arr,start,array,0,array.length);
//        Arrays.sort(array);
//        System.arraycopy(array,0,arr,start,array.length);
    }
}
