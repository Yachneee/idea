package day1_904.pm;

/**
 * @author Administrator
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
