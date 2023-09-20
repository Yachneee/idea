package day3_920.exercise;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class Exe5 {
    static HashMap<String,Integer> map=new HashMap<>(30);
    @SneakyThrows
    public static void main(String[] args) {
        File f=new File("io/920");
        File[] files = f.listFiles((o) -> o.getName().endsWith(".txt"));

        CountDownLatch latch=new CountDownLatch(files.length);
        for (int i = 0; i < files.length; i++) {
            File file=files[i];
            new Thread(new MyRunnable(latch,file)).start();
        }
        latch.await();
        map.forEach((key,value)-> System.out.println(key+"-->"+value));
    }
    static class MyRunnable implements Runnable{
        CountDownLatch latch;
        File file;
        MyRunnable(CountDownLatch latch,File file){
            this.file=file;
            this.latch=latch;
        }
        @Override
        public void run() {
            try (FileInputStream in = new FileInputStream(file)) {
                String str=new String(in.readAllBytes());
                System.out.println(str);
                for (int j = 0; j < str.length(); j++) {
                    char c=str.charAt(j);
                    if(!Character.isLetter(c)){
                        str=str.replace(c,' ');
                    }
                }
                while(str.contains("  ")){
                    str=str.replace("  "," ");
                }
                System.out.println(str);
                String[] split = str.split(" ");
                for (int j = 0; j < split.length; j++) {
                    String word=split[j];
                    if(map.containsKey(word)){
                        map.put(word,map.get(word)+1);
                    }else{
                        map.put(word,1);
                    }
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
            latch.countDown();
        }
    }
}

