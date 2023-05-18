package J1LP0013.Dao;

/**
 * Created by Binh
 * Date : 5/5/2023 - 9:02 AM
 * Description :
 */
public interface DAOinterface <T>{
    public void loadData();
    public void addNewvehicle(T t);
    public void updateVehicle(int id);
    public void deleteVehicle(int id);
    public void searchVehiclebyID(int id);
    public void searchVehiclebyName(String name);

    public void showVehiclelist(T t);
    public void storeData(T t);
}
