package day1_904.singleton;

/**
 * @author Administrator
 */
public class HungrySingleton {
    /**
     * 饿汉模式
     */
    private static final HungrySingleton INSTANCE =new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
