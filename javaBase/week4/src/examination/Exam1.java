package examination;

import java.util.Arrays;

public class Exam1 {
    /* 成绩和姓名排序 */
    public static void sortTwo(int[][] arr1,String[] arr2,int k){
        for (int i = 1; i < arr1.length; i++) {
            int[] current=arr1[i];
            String current2=arr2[i];
            int prevIndex=i-1;
            for (; prevIndex >= 0 && arr1[prevIndex][k]<current[k]; prevIndex--) {
                arr1[prevIndex+1]=arr1[prevIndex];
                arr2[prevIndex+1]=arr2[prevIndex];
            }
            arr1[prevIndex+1]=current;
            arr2[prevIndex+1]=current2;
        }
    }

    public static void main(String[] args) {
        String[] names={"张三","李四","王五","赵六","孙钱"};
        int[][] scores={    {80,90,78},
                            {90,75,88},
                            {60,100,98},
                            {100,93,68},
                            {70,88,58},
                        };
        int k=1;
        sortTwo(scores,names,k);
        for (int i = 0; i < scores.length; i++) {
            System.out.print(names[i]+"\t");
            System.out.println(Arrays.toString(scores[i]));
        }
    }
}
