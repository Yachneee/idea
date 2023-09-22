package day3_913.bytestream.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Administrator
 */
public class InputTest {
    public static void main(String[] args) {
        File file=new File("D:\\fileTest","inputText.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream in=new FileInputStream(file);
//            int read = in.read();
//            System.out.println((char) read);
            byte[] bytes=new byte[2];
            int size;
            StringBuilder str=new StringBuilder();
            while((size=in.read(bytes))!=-1){
                str.append(new String(bytes));
//                str.append(new String(bytes,0,size));
            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
