package J1LP0013.DataBase;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Binh
 * Date : 4/26/2023 - 12:58 AM
 * Description :
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCUtil.getConnection();
        System.out.println(conn);
        JDBCUtil.printinfo(conn);
        JDBCUtil.closeConnection(conn);
        System.out.println(conn);
    }
}
