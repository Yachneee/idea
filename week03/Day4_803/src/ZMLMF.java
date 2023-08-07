public class ZMLMF {
    public static void main(String[] args) {
        // 世界最高峰珠穆朗玛峰高度是：8848.86米，假如有一张足够大的纸厚度是0.1毫米
        // 请问：该纸折叠多少次，可以折成珠穆朗玛峰的高度
        double paper=0.1;
        int count=0;
        int height=8848860;
        while(paper<=height){
            paper*=2;
            count++;
        }
        System.out.println("0.1毫米的纸折叠成珠穆朗玛峰高度的次数为："+count);
    }
}
