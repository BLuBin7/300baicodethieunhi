package LibraryManager.dao;

import java.util.ArrayList;

/**
 * Created by Binh
 * Date : 4/26/2023 - 8:43 PM
 * Description : DAOinterface
 */
public interface DAOinterface<T> {
    public  int insert(T t);
    public  int update(T t);
    public  int delete(T t);
    public ArrayList<T> selectAll();
    public T selectById(T t);
    public ArrayList<T> selectbyCondition(String condition);

}
