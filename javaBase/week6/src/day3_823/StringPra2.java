package day3_823;

public class StringPra2 {
    public static void main(String[] args) {
        String text="Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java语言是高性能的，Java语言是跨平台的";
//        int index=text.lastIndexOf("Java");
//        int count=1;
//        while(index>0){
//            text=text.substring(0,index);
//            index=text.lastIndexOf("Java");
//            count++;
//        }
        String find="Java";
        int count=countString(text,find);
        System.out.println(count);
    }
    public static int countString(String text,String find){
        int count=0;
        int index=text.length();
        while(index>0){
            index=text.lastIndexOf(find);
            text=text.substring(0,index);
            count++;
        }
        return count;
    }
}
