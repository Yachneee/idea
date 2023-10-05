package day2_926.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
public interface Handler <E>{
    /**
     * 接收ResultSet，返回list集合
     * @param set ResultSet
     * @return list集合
     * @throws SQLException 。
     */
    List<E> handle(ResultSet set) throws SQLException;
}
