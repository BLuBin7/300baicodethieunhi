package J1LP0013.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Binh
 * Date : 4/26/2023 - 5:13 PM
 * Description :
 */



import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

    /**
     * Created by Binh
     * Date : 4/25/2023 - 9:36 PM
     * Description :
     */
    public class main {
        public static void main(String[] args){
            Connection con = null;
            try {
                String connection =
                        "jdbc:sqlserver://LAPTOP-SH8ICRDB;Database= Csdl_Congty;IntegratedSecurity=true";
                try(Connection conn = DriverManager.getConnection(connection)){
                    System.out.println("gg");
                }
                //MYSQL
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            String url = "jdbc:mySQL://localhost:3306/app";
//            String username = "root";
//            String password = "";
//            Connection
//            con = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) { //catch for mysql
                throw new RuntimeException(e);
            }
//        catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
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

