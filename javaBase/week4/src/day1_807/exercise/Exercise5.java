package day1_807.exercise;

public class Exercise5 {
    public static void main(String[] args) {
        //有一个数组int[] arr = {9,1,3,4,54,56,23,22,20,43,45,78};,要求打印数组中能被6整除的元素。
        int[] arr={9,1,3,4,54,56,23,22,20,43,45,78};
        System.out.println("数组arr中能被6整除的元素为：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%6==0){
                System.out.println("    索引为："+i+"，数组元素为："+arr[i]);
            }
        }
    }
}
