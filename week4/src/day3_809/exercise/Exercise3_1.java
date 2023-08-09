package day3_809.exercise;

public class Exercise3_1 {
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
//        1.设计程序按照各个学生的Java成绩进行排序(降序)
        int index=1;

//        Scanner sc=new Scanner(System.in);
//        String cou=sc.next();
//        for (int i = 0; i < courses.length; i++) {
//            if(courses[i]==cou){
//                index=i;
//            }
//        }
        for (int i = 1; i < scores.length; i++) {
            int prevIndex=i-1;
            int[] current=scores[i];
            for (; prevIndex >=0 && current[index]>scores[prevIndex][index]; prevIndex--) {
                scores[prevIndex+1]=scores[prevIndex];
            }
            scores[prevIndex+1]=current;
        }
        for (int[] r : scores) {
            for (int c : r) {
                System.out.print("\t"+c+"\t");
            }
            System.out.println();
        }
//        for( int i=0 ; i<scores.length ; i++ ){
//            System.out.print(names[i]+" => " ); // 输出学生姓名
//            for( int j=0 ; j<scores[i].length ; j++ ){
//                System.out.print(courses[j]+":");// 输出课程名称
//                System.out.print(scores[i][j] ); // 输出课程成绩
//                if( j<scores[i].length-1){
//                    System.out.print(" , ");
//                }
//            }
//            System.out.println();
//        }
    }
}
