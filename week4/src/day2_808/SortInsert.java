package day2_808;

public class SortInsert {
    //  插入排序
    public static void main(String[] args) {
        int[] a=new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //进行插入排序
        for (int i = 1; i < a.length; i++) {    //从下标为1开始向右取值（遍历），每次取值，左边的元素都已按升序完成排序
            int current=a[i];
            int j=i-1;
            for(;j>=0 && current<a[j];j--){    //从i-1开始向左取值，和a[i]比较，若 j<0 | a[j]>a[i] 停止for循环
                a[j+1]=a[j];   //向右移一位（进入循环，说明比a[i]小，要向右移一位）
            }
            a[j+1]=current;  //比a[i]小的所有向右移后，j还会减一，所以把a[i]放到j+1处
        }
        //输出排序后的数组
        for (int arr : a) {
            System.out.print(arr+"\t");
        }
    }
}
