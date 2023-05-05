package J1LP0013.Dao;

/**
 * Created by Binh
 * Date : 5/5/2023 - 9:02 AM
 * Description :
 */
public interface DAOinterface <T>{
    public void loadData();
    public void addNewvehicle(T t);
    public void updateVehicle(T t);
    public void deleteVehicle(T t);
    public void searchVehicle(T t);
    public void showVehiclelist(T t);
    public void storeData(T t);
}
