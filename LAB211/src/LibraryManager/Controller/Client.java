package LibraryManager.Controller;

import java.sql.Date;

/**
 * Created by Binh
 * Date : 4/26/2023 - 8:38 PM
 * Description :
 */
public class Client {
    private int id;
    private int fullName;
    private Date dateofBirth;
    private String address;

    public Client(int id, int fullName, Date dateofBirth, String address) {
        this.id = id;
        this.fullName = fullName;
        this.dateofBirth = dateofBirth;
        this.address = address;
    }
    public Client(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFullName() {
        return fullName;
    }

    public void setFullName(int fullName) {
        this.fullName = fullName;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

