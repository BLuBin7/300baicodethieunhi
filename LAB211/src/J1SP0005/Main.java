package J1SP0005;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/11/2023 - 8:31 PM
 * Description : J1.S.P0005
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nhap n");
        int n = input.nextInt();

        // Input
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("nhap a[" +i+"] : ");
            a[i] = input.nextInt();
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+a[i]);
        }


    }
}
