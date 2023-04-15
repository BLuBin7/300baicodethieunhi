package J1SP0007;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/15/2023 - 10:46 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of array(NOT SORTED): ");
        int n = input.nextInt();

        int[] a = new int[n];
        // Input
        for(int i = 0; i < n; i++){
            System.out.print("a[" +i+"]: ");
            a[i] = input.nextInt();
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
