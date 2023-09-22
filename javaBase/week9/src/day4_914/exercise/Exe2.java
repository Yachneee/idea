package day4_914.exercise;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Administrator
 */
public class Exe2 {
    public static void main(String[] args) {
        File target=new File("D:\\fileTest\\buffer\\csb.txt");
        File destByte=new File("D:\\fileTest\\buffer\\csbByte.txt");
        File destChar=new File("D:\\fileTest\\buffer\\csbChar.txt");
        convertCharsetByte(target,destByte,"GBK");
        convertCharsetChar(target,destChar,"GBK");
    }

    /**
     * 用·字节流·的方法将一种编码格式的文件转换成另一种格式
     * @param target 要转换格式好的文件
     * @param dest 目标文件(转换后的文件路径)
     * @param charsetName 目标格式名
     */
    public static void convertCharsetByte(File target,File dest,String charsetName){
        try (FileInputStream in = new FileInputStream(target);
             BufferedInputStream bufferIn=new BufferedInputStream(in);
             FileOutputStream out=new FileOutputStream(dest);
             BufferedOutputStream bufferOut=new BufferedOutputStream(out)) {
            String str=new String(bufferIn.readAllBytes());
            byte[] strBytes = str.getBytes(charsetName);
            bufferOut.write(strBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 用·字符流·的方法将一种编码格式的文件转换成另一种格式
     * @param target 要转换格式好的文件
     * @param dest 目标文件(转换后的文件路径)
     * @param charsetName 目标格式名
     */
    public static void convertCharsetChar(File target,File dest,String charsetName){
        try (FileReader reader = new FileReader(target);
        BufferedReader bufferR=new BufferedReader(reader);
        FileWriter writer=new FileWriter(dest, Charset.forName(charsetName));
        BufferedWriter bufferW=new BufferedWriter(writer)) {
            String s;
            while((s = bufferR.readLine())!=null){
                bufferW.write(s);
                bufferW.newLine();
            }

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
