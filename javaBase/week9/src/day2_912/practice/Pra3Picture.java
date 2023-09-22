package day2_912.practice;

import java.io.File;

/**
 * @author Administrator
 */
public class Pra3Picture {
    public static void main(String[] args) {
        File file=new File("D:\\fileTest");
        File[] pictureFile = file.listFiles(o -> {
            String name = o.getName().toLowerCase();
            return o.isFile() && (name.endsWith(".jpg") || name.endsWith(".svg") || name.endsWith(".png") || name.endsWith(".gif"));
        });
        for (File file1 : pictureFile) {
            System.out.println(file1.getName());
        }
    }
}
