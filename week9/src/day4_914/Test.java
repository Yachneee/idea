package day4_914;

import java.io.*;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        File file=new File("D:\\fileTest\\Hug me.mp4");
        File target=new File("D:\\fileTest\\gb.mp4");
        try (FileOutputStream out=new FileOutputStream(target,true)) {
            for (int i = 0; i <100; i++) {
                try (FileInputStream in = new FileInputStream(file)) {
                    byte[] bytes = in.readAllBytes();
                    out.write(bytes);
                }
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
