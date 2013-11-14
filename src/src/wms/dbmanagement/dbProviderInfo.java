package wms.dbmanagement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.io.IOException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;
/**
 *
 * @author song
 */
public class dbProviderInfo {
   public static void showTable(String tableName)  {
      try {
         Connection conn = DBConnection.getConnection();
         try {
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM"+ tableName);
           // crs = new CachedRowSetImpl();
         } catch (Exception ex)  {
            
         }
      } catch (SQLException ex)  {
         ex.printStackTrace();
      } catch (IOException ex)  {
         ex.printStackTrace();
      }
   }
   
   private CachedRowSet crs;
}
