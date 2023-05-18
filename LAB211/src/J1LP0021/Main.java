package J1LP0021;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 5/18/2023 - 6:46 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        do{
            System.out.println("WELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5.Exit");

            choice = input.nextInt();
            if(choice == 1){

            }
            else if (choice == 2) {

            }
            else if (choice == 3) {

            }
            else if (choice == 4) {

            }
            else if (choice == 5) {
                break;
            }


        }while(choice !=0);
    }
}
