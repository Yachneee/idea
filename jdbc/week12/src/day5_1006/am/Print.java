package day5_1006.am;

import java.lang.reflect.Field;

/**
 * @author Administrator
 */
public class Print {
    public static void outConsole(Object... objects) throws IllegalAccessException {
        for (Object o : objects) {
            out(o);
        }
    }
    private static void out(Object o) throws IllegalAccessException {
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        String name = aClass.getName();
        System.out.println("\33[35m"+name.substring(name.lastIndexOf(".")+1)+"\33[0m");
        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println(f.getName()+"=="+f.get(o));
        }
    }
}