package day1_814;

import java.util.Arrays;

public class SortQuick {
    public static void main(String[] args) {   //升序
        int[] data = { 19 , 22 , 98 , 100 , 56 , 77 , 45 , 72 , 0 , -1 };
        quickSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int leftPoint = startIndex;
        int rightPoint = endIndex;
        while (leftPoint < rightPoint) {
// 从右向左找出比pivot小的数据
            while (leftPoint < rightPoint && arr[rightPoint] >= pivot) {
                rightPoint--;
            }
// 从左向右找出比pivot大的数据
            while (leftPoint < rightPoint && arr[leftPoint] <= pivot) {
                leftPoint++;
            }
// 没有过界则交换
            if (leftPoint < rightPoint) {
                int temp = arr[leftPoint];
                arr[leftPoint] = arr[rightPoint];
                arr[rightPoint] = temp;
            }
        }
// 最终将分界值与当前指针数据交换
        arr[startIndex] = arr[rightPoint];
        arr[rightPoint] = pivot;
// 返回分界值所在下标
        return rightPoint;
    }
    public static void quickSort(int[] array, int low, int high)
    {
        if (low < high) {
            int position = partition(array, low, high);
            quickSort(array, low, position - 1);
            quickSort(array, position + 1, high);
        }
    }
}
