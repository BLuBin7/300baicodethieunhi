package J1LP0013.Model;

import J1LP0013.Controller.VehicleController;

/**
 * Created by Binh
 * Date : 4/23/2023 - 9:52 PM
 * Description :
 */
public class Car implements VehicleController {
    private static int id = 0;
    private String name;
    private String color;
    private double price;
    private String brand;
    private String type;
    private int yearofmanufacture;
    public static int increaseid(){
        return id++;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearofmanufacture() {
        return yearofmanufacture;
    }

    public void setYearofmanufacture(int yearofmanufacture) {
        this.yearofmanufacture = yearofmanufacture;
    }

    public Car(){}
    public Car(String name, String color, double price, String brand, String type, int yearofmanufacture) {
        increaseid();
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.type = type;
        this.yearofmanufacture = yearofmanufacture;
    }
}
