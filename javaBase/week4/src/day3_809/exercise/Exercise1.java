package day3_809.exercise;

public class Exercise1 {
    public static void main(String[] args) {
        char[][] chunxiao = {
                { '春' , '眠' , '不' , '觉' , '晓' } ,
                { '处' , '处' , '闻' , '啼' , '鸟' } ,
                { '夜' , '来' , '风' , '雨' , '声' } ,
                { '花' , '落' , '知' , '多' , '少' }
        } ;
        for (int i = 0; i < chunxiao.length; i++) {
            for (int j = 0; j < chunxiao[i].length; j++) {
                System.out.print("\t"+i+j+"\t");
            }
            System.out.println();
            for (char c : chunxiao[i]) {
                System.out.print("\t"+c+"\t");
            }
            System.out.println();
        }
    }
}
