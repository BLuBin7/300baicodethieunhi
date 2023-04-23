package J1LP0013;

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
        System.out.print("Nhap lua chon : ");
        int choice = input.nextInt();
        do{
            System.out.print("1. Load data from file");
            System.out.print("2.  Add new vehicle ");
            System.out.print("3. Update vehicle");
            System.out.print("4. Delete vehicle ");
            System.out.print("5. Search vehicle");
            System.out.print("6. Show vehicle list");
            System.out.print("7. Store data to file");

            if (choice == 1) {

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
