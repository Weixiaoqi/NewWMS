package wms.dbmanagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.io.*;
import java.sql.DriverManager;
/**
 * 这个类主要实现数据库的连接
 * @author song
 */
public class DBConnection {
   /**
    * Gets a connection 
    * @return the database connection
    */
   public static Connection getConnection() throws SQLException, IOException {
      String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
      String dbUrl = "jdbc:sqlserver://localhost:1433; databaseName = WMS";
      String userName = "sa";
      String userPassword = "123456";
      
      try {
         Class.forName(driverName);
         System.out.println("驱动加载成功");
      } catch (ClassNotFoundException ex)  {
         ex.printStackTrace();
      }
      
      return DriverManager.getConnection(dbUrl, userName, userPassword);
   }
}
