package LibraryManager.Model;

import J1LP0013.Controller.VehicleController;

/**
 * Created by Binh
 * Date : 4/23/2023 - 9:53 PM
 * Description :
 */
public class Motobike implements VehicleController {
    private String id;
    private String name;
    private Double price;
    public Motobike(){}

    public Motobike(String id, String name, Double price) {
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
        return "Motobike{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
