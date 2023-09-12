package day2_912.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class Pra1AllSubFiles {
    public static void main(String[] args) {
        File file=new File("D:\\kaifamiao\\java\\week9");
        List<File> fileList = getAllFiles(file);
        fileList.forEach(o-> System.out.println(o.getName()));
//        System.out.println(fileList);
    }
    public static List<File> getAllFiles(File file){
        if(file.isFile()){
            return List.of(file);
        }
        List<File> fileList=new ArrayList<>();
        File[] files = file.listFiles(pathname -> !file.isHidden());
        for (File value : files) {
            if (value.isFile()) {
                fileList.add(value.getAbsoluteFile());
            } else {
                fileList.addAll(getAllFiles(value));
            }
        }
        return fileList;
    }
}
