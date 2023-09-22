package day3_913.bytestream.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 */
public class OutputTest2 {
    public static void main(String[] args) {
        File file=new File("D:\\fileTest\\out.txt");
        File dest=new File("D:\\fileTest\\outputText.txt");
        System.out.println(file.renameTo(dest));
        try {
            FileOutputStream out = new FileOutputStream(dest,true);
            out.write(97);
            byte[] bytes = " hello world".getBytes();
            out.write(bytes);
            out.write(bytes,0,2);
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
