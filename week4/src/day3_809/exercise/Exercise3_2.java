package day3_809.exercise;


public class Exercise3_2 {
    public static void main(String[] args) {
        //// 设 names 数组中存放学生姓名
        // 设 courses 数组中依次存放三门课程的名称
        // 设 scores 数组中依次存储的是 names 数组中各个学生的 C++ 、Java 、Python 课程的成绩
        String[] names= { "安琪拉" , "王昭君" , "蔡文姬" , "妲己" , "张良" };
        String[] courses= { "C++" , "Java" , "Python" };
        int[][] scores= {
                 {  90 ,  89 ,  75 } ,
                 {  59 ,  40 , 100 } ,
                 { 100 ,  99 ,  80 } ,
                 {  80 ,  61 ,  61 } ,
                 {  60 , 100 ,  99 } ,
        };
//      设计程序，根据学生总成绩进行排序(降序排列)，并输出学生姓名、每门课程的名称和该学生的成绩、该学生的总成绩
        int[][] sum=new int[5][4];
        for (int i = 0; i < sum.length; i++) {
            int s=0;
            for (int j = 0; j < sum[i].length; j++) {
                if(j<sum[i].length-1){
                    sum[i][j]=scores[i][j];
                    s+=sum[i][j];
                }else{
                    sum[i][j]=s;
                }
            }
        }
        System.out.println("排序前的 学生姓名、每门课程的名称和该学生的成绩、该学生的总成绩：");
        for (int i = 0; i < sum.length; i++) {
            System.out.print(names[i]+" =>" ); // 输出学生姓名
            for (int j = 0; j < sum[i].length; j++) {
                if(j<sum[i].length-1){
                    System.out.print("\t"+courses[j]+"：");// 输出课程名称
                }else{
                    System.out.print("\t总成绩：");// 输出课程名称 或者 ”总成绩“
                }
                System.out.print(sum[i][j]+"\t");   //输出课程成绩 与 总成绩
            }
            System.out.println();
        }
        //插入排序
        int index=3;
        for (int i = 1; i < sum.length; i++) {
            int prevIndex=i-1;
            int[] current=sum[i];
            String currentN=names[i];
            for (; prevIndex >=0 && current[index]>sum[prevIndex][index]; prevIndex--) {
                sum[prevIndex+1]=sum[prevIndex];
                names[prevIndex+1]=names[prevIndex];
            }
            sum[prevIndex+1]=current;
            names[prevIndex+1]= currentN;
        }
        System.out.println();
        System.out.println("按总成绩降序排序后的 学生姓名、每门课程的名称和该学生的成绩、该学生的总成绩：");
        for (int i = 0; i < sum.length; i++) {
            System.out.print(names[i]+" =>" ); // 输出学生姓名
            for (int j = 0; j < sum[i].length; j++) {
                if(j<sum[i].length-1){
                    System.out.print("\t"+courses[j]+"：");// 输出课程名称
                }else{
                    System.out.print("\t总成绩：");// 输出课程名称 或者 ”总成绩“
                }
                System.out.print(sum[i][j]+"\t");   //输出课程成绩 与 总成绩
            }
            System.out.println();
        }
    }
}
