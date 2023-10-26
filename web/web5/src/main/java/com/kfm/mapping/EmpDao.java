package com.kfm.mapping;

import com.kfm.entity.Employee;
import com.kfm.utils.DataSourceUtil;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
public class EmpDao {
    private final QueryRunner RUN= new QueryRunner(DataSourceUtil.getDataSource());
    private final BasicRowProcessor processor = new BasicRowProcessor(new GenerousBeanProcessor());
    public List<Employee> selectAll() throws SQLException {
        String sql="select * from s_emp";
        return RUN.query(sql,new BeanListHandler<>(Employee.class,processor));
    }
    public int deleteById(int id) throws SQLException {
        String sql="delete from s_emp where id=?";
        return RUN.update(sql,id);
    }
    public Employee selectById(int id) throws SQLException {
        String sql="select * from s_emp where id=?";
        return RUN.query(sql,new BeanHandler<>(Employee.class,processor),id);
    }
}
