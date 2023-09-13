package day3_913.exercise;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Administrator
 */
public class Exe3 {
    public static void main(String[] args) {
        String targetFolder= "D:\\fileTest\\split";
        String destFolder= "D:\\fileTest\\merge";
        mergeMp4(targetFolder,destFolder);
    }
    public static void mergeMp4(String targetFolder,String destFolder){
        File folder=new File(targetFolder);
        File file=new File(destFolder,"result.mp4");
        try (FileOutputStream out = new FileOutputStream(file,true)) {
//            File[] files = folder.listFiles();
//            if (files != null) {
//                Arrays.sort(files, (o1, o2) -> {
//                    String n1=o1.getName();
//                    String n2=o2.getName();
//                    int num1=Integer.parseInt(n1.substring(0,n1.indexOf('.')));
//                    int num2=Integer.parseInt(n2.substring(0,n2.indexOf('.')));
//                    return num1-num2;
//                });
//                for (File value : files) {
//                    FileInputStream in = new FileInputStream(value);
//                    byte[] bytes = in.readAllBytes();
//                    out.write(bytes);
//                    in.close();
//                }
//            }
            int i=1;
            File f=new File(folder,i+".mp4");
            while(f.exists()){
                FileInputStream in = new FileInputStream(f);
                out.write(in.readAllBytes());
                in.close();
                i++;
                f=new File(folder,i+".mp4");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
