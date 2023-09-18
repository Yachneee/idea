package day5_915.exercise;

import com.alibaba.fastjson2.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Administrator
 */
public class Exe2_JSON {
    public static void main(String[] args) {
        try (PrintStream print = new PrintStream(new File("text", "game.txt"))) {
            Game wz=new Game("王者荣耀",5.0,1024,0.0);
            String jsonString = JSON.toJSONString(wz);
            print.print(jsonString);
            print.print('\n');
            Game hpjy=new Game("和平精英",4.0,1024,0.0);
            String jsonString1 = JSON.toJSONString(hpjy);
            print.println(jsonString1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
