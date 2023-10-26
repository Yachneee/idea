package mapper;

import entity.FileT;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DataSourceUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
public class FileDao {
    private final QueryRunner RUN= new QueryRunner(DataSourceUtil.getDataSource());
    public List<FileT> selectAll() throws SQLException {
        String sql="select * from kfm_file";
        return RUN.query(sql, new BeanListHandler<>(FileT.class));
    }
    public int insert(String name,long size,String time,String ip,String link) throws SQLException {
        String sql="insert into kfm_file(name, size, create_time, upload_ip, download_link) VALUES(?,?,?,?,?)";
        return RUN.update(sql,name,size,time,ip,link);
    }
}
