package day4_914.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class Exe1 {
    public static void main(String[] args) {
        File target=new File("D:\\fileTest\\buffer\\csbNotSort.txt");
        File dest=new File("D:\\fileTest\\buffer\\csb.txt");
        File dest2=new File("D:\\fileTest\\buffer\\csbSentence.txt");
        sortPoem(target,dest);
        sortSentencePoem(target,dest2);
    }
    public static void sortPoem(File target,File dest){
        List<String> list=new ArrayList<>();
        String str;
        try (FileReader r = new FileReader(target);
             BufferedReader bufferR=new BufferedReader(r);
             FileWriter w=new FileWriter(dest);
             BufferedWriter bufferW=new BufferedWriter(w)) {
            while((str=bufferR.readLine())!=null){
                list.add(str);
            }
            list.sort((o1, o2) -> Integer.parseInt(o1.substring(0, o1.indexOf("."))) - Integer.parseInt(o2.substring(0, o2.indexOf("."))));
            for (String s : list) {
                bufferW.write(s);
                bufferW.newLine();
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void sortSentencePoem(File target,File dest){
        List<String> list=new ArrayList<>();
        String str;
        try (FileReader r = new FileReader(target);
             BufferedReader bufferR=new BufferedReader(r);
             FileWriter w=new FileWriter(dest);
             BufferedWriter bufferW=new BufferedWriter(w)) {
            while((str=bufferR.readLine())!=null){
                list.add(str);
            }
            list.sort((o1, o2) -> Integer.parseInt(o1.substring(0, o1.indexOf("."))) - Integer.parseInt(o2.substring(0, o2.indexOf("."))));
            for (String s : list) {
                String[] split = s.split("。");
                for (String sentence : split) {
                    bufferW.write(sentence+"。");
                    bufferW.newLine();
                }
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
