package day1_925.handler;

/**
 * @author Administrator
 */
public interface Handler<E> {
    /**
     * 根据传递的参数封装成一个 E 对象
     * @param objects 参数
     * @return 对象
     */
    E getOne(Object... objects);
}




