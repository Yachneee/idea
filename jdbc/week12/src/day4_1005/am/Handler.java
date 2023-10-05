package day4_1005.am;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Administrator
 */
@FunctionalInterface
public interface Handler<E> {
    /**
     * 封装对象
     * @param set 一行数据
     * @return 对应的对象
     * @throws SQLException getObject产生的异常
     */
    E handle(ResultSet set) throws SQLException;
}
