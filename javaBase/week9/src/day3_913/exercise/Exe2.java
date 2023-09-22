package day3_913.exercise;

import java.io.*;

/**
 * @author Administrator
 */
public class Exe2 {
    public static void main(String[] args) {
        String target="D:\\fileTest\\Hug me.mp4";
        String folderName="D:\\fileTest\\split";
        splitMp4(target,folderName,1024*1024);
    }
    public static void splitMp4(String target,String folderName,long length){
        File targetFile=new File(target);
        File folder=new File(folderName);
        if(!targetFile.exists()){
            throw new RuntimeException("文件不存在");
        }
        if(!folder.exists()){
            System.out.println(folder.mkdirs());
        }
        try (FileInputStream in = new FileInputStream(target)) {
            byte[] bytes=new byte[(int)length];
            int size;
            int count=0;
            while((size=in.read(bytes))!=-1){
                File file=new File(folderName,++count+".mp4");
                try(FileOutputStream out=new FileOutputStream(file)) {
                    out.write(bytes,0,size);
                }
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
