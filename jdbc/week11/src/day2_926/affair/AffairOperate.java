package day2_926.affair;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Administrator
 */
public class AffairOperate {
    public static void main(String[] args) {
        transfer();
    }
    public static void transfer(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kfm", "root", "");
            //设置手动提交事务
            conn.setAutoCommit(false);
            String sql="update account set balance = balance -? where id =? ";
            PreparedStatement prepared = conn.prepareStatement(sql);
            //小王转账
            prepared.setDouble(1,8000);
            prepared.setInt(2,1);
            //执行事务
            int i = prepared.executeUpdate();
            if(i>0){
                System.out.println("转出成功");
            }else{
                System.out.println("转出失败");
            }
//            int num=1/0;
            //小王嫂收钱
            prepared.setDouble(1,-8000);
            prepared.setInt(2,2);
            int j=prepared.executeUpdate();
            if(j>0){
                System.out.println("收到");
            }else{
                System.out.println("入账失败");
            }
            //提交事务
            conn.commit();
        } catch (SQLException | ArithmeticException e) {
            //回滚事务
            if(conn!=null){
                try {
                    conn.rollback();
                    System.out.println("回滚");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
