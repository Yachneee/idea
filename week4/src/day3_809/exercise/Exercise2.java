package day3_809.exercise;

public class Exercise2 {
    public static void main(String[] args) {
        char[][] chunxiao = {
                {'春', '眠', '不', '觉', '晓'},
                {'处', '处', '闻', '啼', '鸟'},
                {'夜', '来', '风', '雨', '声'},
                {'花', '落', '知', '多', '少'}
        };
        int k = 0;
        //找出chunxiao[i]的最大长度(因为二维可以定义不同长度的数组，所以需要找到最长的，才能翻转)
//        for (int i = 0; i < chunxiao.length; i++) {
//            for (int j = 0; j < chunxiao[i].length; j++) {
//               if(j+1>k){
//                   k++;
//               }
//            }
//        }
//        System.out.println(k);
        for (int i = 0; i < chunxiao[k].length; i++) {
            for (int j = chunxiao.length-1; j >=0; j--) {
                System.out.print("\t"+j+i+"\t");
            }
            System.out.println();
            for (int j = chunxiao.length - 1; j >= 0; j--) {
                System.out.print("\t" + chunxiao[j][i] + "\t");
            }
            System.out.println();
        }
    }
}