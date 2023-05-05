package LibraryManager.DataBase;
import J1LP0013.DataBase.JDBCUtil;
import LibraryManager.Model.Book;
import LibraryManager.dao.BookDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/26/2023 - 12:58 AM
 * Description :
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        //1. open Connection
        Connection conn = JDBCUtil.getConnection();

        //2. create statement object
        Statement st = conn.createStatement();

        //3. Query
        Book b1 = new Book("1","code clean",88000,2023);
        BookDAO.getInstance().insert(b1);
        for (int i = 0; i < 1000;i++) {
            Book book = new Book(""+i ,"CODE CLEAN "+i,20000+i,2023);
            BookDAO.getInstance().insert(book);
        }

        //UPDATE
//        String id, namebook;
//        System.out.println("Nhap id sach :" );
//        id = input.nextLine();
//        System.out.println("Nhap ten sach :" );
//        namebook = input.nextLine();
//        Book b2 = new Book(id,namebook,88000,2023);
//        BookDAO.getInstance().update(b2);

        //DELETE
        for (int i = 0; i < 1000; i++) {
            BookDAO.getInstance().delete(b1);
        }


    }
}
