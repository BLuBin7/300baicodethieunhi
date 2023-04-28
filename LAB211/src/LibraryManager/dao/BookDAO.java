package LibraryManager.dao;

import J1LP0013.DataBase.JDBCUtil;
import LibraryManager.Model.Book;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Binh
 * Date : 4/26/2023 - 8:48 PM
 * Description : BookDAO
 */
public class BookDAO implements DAOinterface<Book> {

    // khong can new doi tuong, chi can goi ham getInstance() thoi
    public static BookDAO getInstance(){
        return new BookDAO();
    }
    @Override
    public int insert(Book book) {
        Connection con = JDBCUtil.getConnection();
        try {
            Statement st = con.createStatement();
            String sql =
                    " INSERT into Book(id,nameBook, price, publishingYear) " +
                            " values ('"+book.getId()+"','"+book.getNameBook()+"',"+book.getPrice()+","+book.getPublishingYear()+")";
            // insert,delete, update call this function
            // If not found Library.book , you should set  library default
            int ketqua = st.executeUpdate(sql);
            if(ketqua > 0){
                System.out.println("Successfull");
            }
            else {
                System.out.println("Failed!");
            }

            System.out.println("so dong da them : " +ketqua);

            // Disconnection
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int update(Book book) {
        Connection con = JDBCUtil.getConnection();
        try {
            Statement st = con.createStatement();

            String sql =
                    "UPDATE book "+
                    "SET "+"nameBook = '" +book.getNameBook() +" ' "+
                            "WHERE id = " + book.getId();
            // insert,delete, update call this function
            // If not found Library.book , you should set  library default
            int ketqua = st.executeUpdate(sql);
            System.out.println("so dong da them : " + ketqua);

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 0;
    }
    @Override
    public int delete(Book book) {
        Connection con = JDBCUtil.getConnection();
        try {
            Statement st = con.createStatement();

            String sql =
                    " DELETE FROM book"+
                            " WHERE id = " + book.getId();
            // insert,delete, update call this function
            // If not found Library.book , you should set  library default
            int ketqua = st.executeUpdate(sql);
            System.out.println("so dong da xoa : " + ketqua);

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 0;
    }

    @Override
    public ArrayList<Book> selectAll() {
        return null;
    }

    @Override
    public Book selectById(Book book) {
        return null;
    }

    @Override
    public ArrayList<Book> selectbyCondition(String condition) {
        return null;
    }
}
