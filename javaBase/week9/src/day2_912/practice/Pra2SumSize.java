package day2_912.practice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static day2_912.practice.Pra1AllSubFiles.getAllFiles;

/**
 * @author Administrator
 */
public class Pra2SumSize {
    public static void main(String[] args) {
        File file=new File("D:\\kaifamiao\\java\\week9");
        List<File> fileList = getAllFiles(file);
        Map<String,Double> fileDoubleMap=new HashMap<>();
        double sumSize=0;
        for (File f : fileList) {
            sumSize+=f.length();
            fileDoubleMap.put(f.getName(), f.length()/1024.0);
        }
        System.out.println(fileDoubleMap);
        System.out.printf("%s 文件夹下的文件共 %.2f KB",file.getName(),sumSize/1024.0);
    }
}
