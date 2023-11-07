package com.kfm.kfmBatis.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Administrator
 */
public class GenderHandler extends BaseTypeHandler<String>{
    /**
     * 设置值时，调用此方法进行转换(插入)
     *
     * @param ps PreparedStatement 对象
     * @param i 参数的顺序，第几个参数
     * @param parameter 参数
     * @param jdbcType 数据库类型
     * @throws SQLException SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        if("男".equals(parameter)){
            ps.setInt(i,1);
        }else if("女".equals(parameter)){
            ps.setInt(i,0);
        }
    }
    /**
     * 获取到值后进行对象关系映射时调用
     *
     * @param rs 结果集
     * @param columnName 列名
     * @return 转换后的结果，用于设置对象的值
     * @throws SQLException SQLException
     */
    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getInt(columnName) == 1?"男":"女";
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return rs.getInt(columnIndex) == 1?"男":"女";
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getInt(columnIndex) == 1?"男":"女";
    }
}
