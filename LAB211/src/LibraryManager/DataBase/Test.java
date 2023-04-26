package LibraryManager.DataBase;
import J1LP0013.DataBase.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Binh
 * Date : 4/26/2023 - 12:58 AM
 * Description :
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        //1. open Connection
        Connection conn = JDBCUtil.getConnection();

        //2. create statement object
        Statement st = conn.createStatement();
        //3. Query
        var sql = "insert into TRUSO_PHONG values (4,'Binh Chanh')";
        var deleteStatement = "DELETE FROM TRUSO_PHONG WHERE TruSo='Binh Chanh' ";
        //4. add and delete database
       int check = st.executeUpdate(sql);
//        int check = st.executeUpdate(deleteStatement);

        if(check>0){
            System.out.println("Successfully");
        }else{
            System.out.println("Failed");
        }

        //5. close Connection
        JDBCUtil.closeConnection(conn);
    }
}
