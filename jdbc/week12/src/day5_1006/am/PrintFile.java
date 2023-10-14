package day5_1006.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;

/**
 * @author Administrator
 */
public class PrintFile {
    static File f=new File("io/printFile-10-6.txt");
    public static void outConsole(Object... objects) throws IllegalAccessException {
        try(PrintWriter printWriter = new PrintWriter(new FileOutputStream(f))){
            for (Object o : objects) {
                out(o,printWriter);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    private static void out(Object o,PrintWriter printWriter) throws IllegalAccessException {
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        String name = aClass.getTypeName();
        printWriter.println("⭐⭐⭐⭐"+name.substring(name.lastIndexOf(".")+1)+"️⭐⭐⭐⭐");
        for (Field f : fields) {
            f.setAccessible(true);
            printWriter.println("  "+f.getName()+"=="+f.get(o));
        }

    }
}