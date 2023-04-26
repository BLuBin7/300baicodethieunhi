package J1LP0013.DataBase;


import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * Created by Binh
 * Date : 4/25/2023 - 9:36 PM
 * Description :
 */
public class JDBCUtil {
    public static Connection getConnection(){
        Connection con = null;
        try {
            //SQL
//            String connection =
//                    "jdbc:sqlserver://LAPTOP-SH8ICRDB;Database= Csdl_Congty;IntegratedSecurity=true";
//            Connection conn = DriverManager.getConnection(connection);
            //MYSQL
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mySQL://localhost:3306/library";
            String username = "root";
            String password = "";
//            Connection
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) { //catch for mysql
            throw new RuntimeException(e);
        }
//        catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        return con;
    }

    public static void closeConnection(Connection c){
        try{
            if(c != null){
                c.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // print info
    public static void printinfo(Connection c) throws SQLException {
        if(c != null){
            DatabaseMetaData metaData = c.getMetaData();
            // Get Name Csdl
            System.out.println(metaData.getDatabaseProductName());
            System.out.println(metaData.getURL());
        }
    }
}
