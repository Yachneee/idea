package day5_915.exercise;

import com.alibaba.fastjson2.JSON;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Administrator
 */
public class Exe3 {
    public static void main(String[] args) {
        //Reader
        File f=new File("text/student.json");
        try(BufferedReader bufferR=new BufferedReader(new FileReader(f))){
            Student stu = JSON.parseObject(bufferR, Student.class);
            System.out.println(stu);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        //URL
        try {
            URL url=new URL("file://localhost/D:/kaifamiao/java/text/student.json");
            Student student = JSON.parseObject(url, Student.class);
            System.out.println(student);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
