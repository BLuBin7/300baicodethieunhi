package J1LP0013;

import J1LP0013.Dao.CarDAO;
import J1LP0013.Exception.NotFoundName;

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
            if (choice == 1) {
                CarDAO.getInstance().loadData();
            }

            if (choice == 2) {

            }

            if (choice == 3) {

            }

            if (choice == 4) {

            }

            if(choice == 5){
                System.out.print("1. Search by Name ");
                System.out.print("2. Search by id ");
                System.out.print("Nhap lua chon");
                int i = input.nextInt();
                try {
                    if (i == 1) {

                    }
                    if (i == 2) {

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
