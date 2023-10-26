package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Administrator
 */
public class DataSourceUtil {
    private final static Properties PROP= new Properties();
    private static DataSource source = null;
    static {
        // 获取 datasource.properties 所在的流
        InputStream in = DataSourceUtil.class.getClassLoader().getResourceAsStream("kfm.properties");
        try {
            PROP.load(in);
            source = DruidDataSourceFactory.createDataSource(PROP);
        } catch (IOException e) {
            System.out.println("加载配置失败");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("创建数据源失败");
            e.printStackTrace();
        }
    }


    public static DataSource getDataSource() {
        return source;
    }
}
