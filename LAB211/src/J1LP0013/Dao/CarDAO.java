package J1LP0013.Dao;

import J1LP0013.DataBase.JDBCUtil;

import java.sql.*;

/**
 * Created by Binh
 * Date : 5/5/2023 - 9:07 AM
 * Description :
 */
public class CarDAO implements DAOinterface{

    public static CarDAO getInstance() {
        return new CarDAO();
    }

    @Override
    public void loadData() {
        Connection con = JDBCUtil.getConnection();

        try {
            // Option 1 : use Statement
            // truy vấn được 1 lần, ko truyền được câu lệnh sql trực tiếp mà phải thông qua ResultSet
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            // ResultSet : con trỏ di chuyển xung quanh các dòng
            ResultSet rs = statement.executeQuery("SELECT * FROM car");

           // Option 2 : use PreparedStatement
//            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM car");
//            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1) +"|"+ rs.getString(2) +"|"+rs.getString(3)+"|"+rs.getDouble(4)+"|"+rs.getString(5)+"|"+rs.getString(6)+"|"+rs.getInt(7));
            }


            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }

    @Override
    public void addNewvehicle(Object o) {

    }

    @Override
    public void updateVehicle(Object o) {

    }

    @Override
    public void deleteVehicle(Object o) {

    }

    @Override
    public void searchVehicle(Object o) {

    }

    @Override
    public void showVehiclelist(Object o) {

    }

    @Override
    public void storeData(Object o) {

    }
}
