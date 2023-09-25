package day1_925.handler;

public interface Handler<E> {
    E getOne(Object... objects); // 根据传递的参数封装成一个 E 对象
}




