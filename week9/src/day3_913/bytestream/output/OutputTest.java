package day3_913.bytestream.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Administrator
 */
public class OutputTest {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("D:\\fileTest\\out.txt");
            out.write(97);
            byte[] bytes = "你好啊".getBytes();
            out.write(bytes);
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
