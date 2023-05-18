package J1LP0013;

import J1LP0013.Dao.CarDAO;
import J1LP0013.Exception.NotFoundName;
import J1LP0013.Model.Car;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/23/2023 - 9:53 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1. Load data from file");
            System.out.println("2. Add new vehicle ");
            System.out.println("3. Update vehicle");
            System.out.println("4. Delete vehicle ");
            System.out.println("5. Search vehicle");
            System.out.println("6. Show vehicle list");
            System.out.println("7. Store data to file");
            System.out.println("Nhap lua chon : ");
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                CarDAO.getInstance().loadData();
            }

            if (choice == 2) {
                System.out.print("Name:");
                String name = input.nextLine();
                System.out.print("Color:");
                String color = input.nextLine();
                System.out.print("Price:");
                double price = input.nextDouble();
                input.nextLine();
                System.out.print("Brand:");
                String brand = input.nextLine();
                System.out.print("Type:");
                String type = input.nextLine();
                System.out.print("Year:");
                int year = input.nextInt();

                Car car = new Car(name,color,price,brand,type,year);
                CarDAO.getInstance().addNewvehicle(car);
            }

            if (choice == 3) {
                System.out.print("nhap id :");
                int id = input.nextInt();
                CarDAO.getInstance().updateVehicle(id);
            }

            if (choice == 4) {
                System.out.print("nhap id muon xoa");
                int id = input.nextInt();
                CarDAO.getInstance().deleteVehicle(id);
            }

            if(choice == 5){
                System.out.print("1. Search by Name ");
                System.out.print("2. Search by id ");
                System.out.print("Nhap lua chon");
                int i = input.nextInt();
                try {
                    if (i == 1) {
                        System.out.print("nhap ten :");
                        String name = input.nextLine();
                        input.nextLine();
                        CarDAO.getInstance().searchVehiclebyName(name);
                    }
                    if (i == 2) {
                        System.out.print("nhap id :");
                        int id = input.nextInt();
                        CarDAO.getInstance().searchVehiclebyID(id);
                    }
                }catch (Exception e) {

                }
            }


            if (choice == 6) {
                System.out.print("1. Show all");
                System.out.print("2. Show all (descending by price)");
                System.out.print("Nhap lua chon");
                int i = input.nextInt();
                if (i == 1) {

                }
                if (i == 2) {

                }
            }

            if (choice == 7) {

            }
        }while (choice != 0);
    }
}
