package day3_913.exercise;

import java.io.*;

/**
 * @author Administrator
 */
public class Exe2 {
    public static void main(String[] args) {
        String name="D:\\fileTest\\Hug me.mp4";
        String folderName="D:\\fileTest\\split";
        splitMp4(name,folderName);
    }
    public static void splitMp4(String name,String folderName){
        File folder=new File(folderName);
        if(!folder.exists()){
            System.out.println(folder.mkdirs());
        }
        try (FileInputStream in = new FileInputStream(name)) {
            byte[] bytes=new byte[1024*1024];
            int size;
            int count=1;
            while((size=in.read(bytes))!=-1){
                File file=new File(folderName,count+".mp4");
                FileOutputStream out=new FileOutputStream(file);
                out.write(bytes,0,size);
                out.flush();
                out.close();
                count++;
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
