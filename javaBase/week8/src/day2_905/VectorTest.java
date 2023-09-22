package day2_905;

import java.util.Vector;

/**
 * @author Administrator
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector=new Vector(20);
        vector.add("hello");
        vector.add("hi");
        vector.add("he");
        vector.add("she");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i)+"\t");
        }
        System.out.println("\nbubbleSort");
        bubbleSort(vector);
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i)+"\t");
        }
        System.out.println("\nselectSort");
        selectSort(vector);
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i)+"\t");
        }
        System.out.println("\ninsertSort");
        insertSort(vector);
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i)+"\t");
        }
        System.out.println("\nquickSort");
        quickSort(vector,0, vector.size()-1);
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i)+"\t");
        }
    }

    /**
     * 冒泡排序(升序)
     * @param vector 要排序的集合
     */
    public static void bubbleSort(Vector vector){
        for (int i = 0; i < vector.size()-1; i++) {
            for (int j = 0; j < vector.size()-i-1; j++) {
                String str1=(String)vector.get(j);
                String str2=(String)vector.get(j+1);
                if(str1.compareTo(str2)>0){
                    vector.set(j,str2);
                    vector.set(j+1,str1);
                }
            }
        }
    }

    /**
     * 选择排序(升序)
     * @param vector 要排序的集合
     */
    public static void selectSort(Vector vector){
        for (int i = 0; i < vector.size(); i++) {
            String current=(String)vector.get(i);
            int minIndex=i;
            //假设当前是最小的，往后找最小的元素的下标
            for (int j=i+1; j<vector.size()-i;j++) {
                String strMin=(String) vector.get(minIndex);
                String str=(String) vector.get(j);
                minIndex=strMin.compareTo(str)<0?minIndex:j;
            }
            vector.set(i,vector.get(minIndex));
            vector.set(minIndex,current);
        }
    }

    /**
     * 插入排序(升序)
     * @param vector 要排序的集合
     */
    public static void insertSort(Vector vector){
        for (int i = 1; i < vector.size(); i++) {
            String current=(String)vector.get(i);
            int j = i-1;
            String str=(String)vector.get(j);
            //找到前面比当前值大的后移
            for (; j>=0&&str.compareTo(current)>0; j--) {
                vector.set(j+1,str);
            }
            vector.set(j+1,current);
        }
    }

    /**
     * 快速排序(升序)
     * @param vector 要排序的集合
     * @param left 开始下标
     * @param right 结束下标
     */
    public static void quickSort(Vector vector,int left,int right){
        if(left>=right){
            return;
        }
        String benchmark=(String) vector.get(left);
        int i=left;
        int j=right;
        while(i<j){
            //从右向左找比基准小的
            while(i<j&&((String)vector.get(j)).compareTo(benchmark)>=0){
                j--;
            }
            //从左向右找比基准大的
            while(i<j&&((String)vector.get(i)).compareTo(benchmark)<=0){
                i++;
            }
            if(i<j){
                String strI=(String) vector.get(i);
                vector.set(i,vector.get(j));
                vector.set(j,strI);
            }
        }
        if(((String)vector.get(i)).compareTo(benchmark)<=0){
            vector.set(left,vector.get(i));
            vector.set(i,benchmark);
        }
        quickSort(vector,left,i-1);
        quickSort(vector,i+1,right);
    }
}
