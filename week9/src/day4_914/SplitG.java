package day4_914;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 */
public class SplitG {
    public static void main(String[] args) {
        String target="D:\\fileTest\\Hug me.mp4";
        String folderName="D:\\fileTest\\split1";
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
            int count = 0;
            while (in.available()>0){
                byte[] byteG = new byte[(int)Math.min((long) Integer.MAX_VALUE - 8,length)];
                File f=new File(folderName,++count+".tmp");
                try(FileOutputStream out=new FileOutputStream(f,true)){
                    long size=length;
                    while(size>0){
                        int r=in.read(byteG);
                        out.write(byteG,0,r);
                        size-=byteG.length;
                    }
                }
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
