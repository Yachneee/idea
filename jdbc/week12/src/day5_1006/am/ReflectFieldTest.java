package day5_1006.am;

import java.lang.reflect.Field;

/**
 * @author Administrator
 */
public class ReflectFieldTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("day5_1006.am.Star");
//        Class<Star> aClass = Star.class;
        Star kun = (Star)aClass.newInstance();
        Field country = aClass.getField("country");
        Field name = aClass.getDeclaredField("name");
        country.set(kun,"China");
        System.out.println(kun);
        Object o = country.get(kun);
        System.out.println(o);
        name.setAccessible(true);
        name.set(kun,"蔡徐坤");
        System.out.println(name.get(kun));
        System.out.println(kun);
    }
}
