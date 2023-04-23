package J1LP0013.Model;

import J1LP0013.Controller.VehicleController;

/**
 * Created by Binh
 * Date : 4/23/2023 - 9:52 PM
 * Description :
 */
public class Car implements VehicleController {
    private String id;
    private String name;
    private Double price;
    public Car(){}

    public Car(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
