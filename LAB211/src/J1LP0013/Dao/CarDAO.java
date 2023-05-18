package J1LP0013.Dao;

import J1LP0013.DataBase.JDBCUtil;
import J1LP0013.Model.Car;

import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.locks.StampedLock;

import static J1LP0013.Model.Car.increaseid;

/**
 * Created by Binh
 * Date : 5/5/2023 - 9:07 AM
 * Description :
 */
public class CarDAO implements DAOinterface<Car>{

    public static CarDAO getInstance() {
        return new CarDAO();
    }
    Scanner input = new Scanner(System.in);
    //connectipm
    Connection con = JDBCUtil.getConnection();

    @Override
    public void loadData() {
        try {
            // Option 1 : use Statement
            // truy vấn được 1 lần, ko truyền được câu lệnh sql trực tiếp mà phải thông qua ResultSet
//                            connect query
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            // ResultSet : con trỏ di chuyển xung quanh các dòng
            // row pointer , executeQuery trả về kiểu ResultSet , nên rs dùng để chạy vòng while để select
            ResultSet rs = statement.executeQuery("SELECT * FROM car");

           // Option 2 : use PreparedStatement ( nên dùng khi muốn query)
//            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM car");
//            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1) +"|"+ rs.getString(2) +"|"+rs.getString(3)+"|"+rs.getDouble(4)+"|"+rs.getString(5)+"|"+rs.getString(6)+"|"+rs.getInt(7));
            }
            //disconnection
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addNewvehicle(Car car) {
        String queryinsert = "INSERT INTO Car(name,color,price,brand,type,year) VALUES( ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(queryinsert);
            // ko có id nên tự dồn dòng lên
            stmt.setString(1,car.getName());
            stmt.setString(2, car.getColor());
            stmt.setDouble(3, car.getPrice());
            stmt.setString(4, car.getBrand());
            stmt.setString(5, car.getType());
            stmt.setInt(6,car.getYearofmanufacture());

            stmt.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateVehicle(int id) {
        try {
            System.out.println("nhap gia muon doi :");
            Double price = input.nextDouble();
            PreparedStatement stmt = con.prepareStatement("UPDATE car SET price ="+ price+"where id = "+id);
            stmt.executeUpdate();

            System.out.println("chinh sua thanh cong");
            // get row
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery("SELECT * FROM car");
            // di chuyen con tro den dong tuong ung voi id
            rs.absolute(id);
            // lay du lieu tu dong do
            System.out.println(rs.getInt(1) +"|"+ rs.getString(2) +"|"+rs.getString(3)+"|"+rs.getDouble(4)+"|"+rs.getString(5)+"|"+rs.getString(6)+"|"+rs.getInt(7));
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteVehicle(int id) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM car WHERE id = "+ id);
            preparedStatement.executeUpdate();


            System.out.println("xoa thanh cong");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM car");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void searchVehiclebyID(int id) {
        try {
            PreparedStatement PreparedStatement = con.prepareStatement("SELECT * FROM car where id ="+id);
            ResultSet rs = PreparedStatement.executeQuery();

            // di chuyen con tro den id
               if(rs.next()){
                   System.out.println("find car");
                   System.out.println(rs.getInt(1) +"|"+ rs.getString(2) +"|"+rs.getString(3)+"|"+rs.getDouble(4)+"|"+rs.getString(5)+"|"+rs.getString(6)+"|"+rs.getInt(7));

               }else {
                   System.out.println("not find car");
               }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void searchVehiclebyName(String name) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM car WHERE name like %"+ name+"%");
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("gg");

            if(rs.next()){
                System.out.println("find car");
                System.out.println(rs.getInt(1) +"|"+ rs.getString(2) +"|"+rs.getString(3)+"|"+rs.getDouble(4)+"|"+rs.getString(5)+"|"+rs.getString(6)+"|"+rs.getInt(7));
            }else {
                System.out.println("not find car");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void showVehiclelist(Car car) {

    }

    @Override
    public void storeData(Car car) {

    }




}
