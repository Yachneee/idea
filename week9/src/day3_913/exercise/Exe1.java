package day3_913.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 */
public class Exe1 {
    public static void main(String[] args) {
        int[] arr={2,3,4,56,4,125};
        String name="D:\\fileTest\\test.txt";
        write(arr,name);
        String str=read(name);
        System.out.println(str);
        int sum = sum(str);
        System.out.println(sum);
    }
    public static void write(int[] arr,String name){
        try (FileOutputStream out=new FileOutputStream(name)) {
            for (int n : arr) {
                byte[] bytes = (n+" ").getBytes();
                out.write(bytes);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static String read(String name){
        String str;
        try (FileInputStream in = new FileInputStream(name)) {
            byte[] bytes = in.readAllBytes();
            str=new String(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
    public static int sum(String str){
        String[] split = str.split(" ");
        int sum=0;
        for (String n : split) {
            sum+=Integer.parseInt(n);
        }
        return sum;
    }
}
