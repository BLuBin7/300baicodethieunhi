package LibraryManager.DataBase;
import J1LP0013.DataBase.JDBCUtil;
import LibraryManager.Model.Book;
import LibraryManager.dao.BookDAO;

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
        Book b1 = new Book("1","code clean",88000,2023);
        BookDAO.getInstance().insert(b1);
    }
}
