package J1LP0013.Controller;

/**
 * Created by Binh
 * Date : 4/23/2023 - 9:48 PM
 * Description :
 */
public class MotorbikeController implements VehicleController{
    private int id;
    private String name;
    private String color;
    private double price;
    private String brand;
    private double speed;
    private boolean license;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public MotorbikeController(int id, String name, String color, double price, String brand, double speed, boolean license) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.speed = speed;
        this.license = license;
    }
}
