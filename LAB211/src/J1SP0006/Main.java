package J1SP0006;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/13/2023 - 10:14 PM
 * Description :
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
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

        System.out.println("Nhap gia tri can tim :");
        int value = input.nextInt();
        BinarySearch binarySearch = new BinarySearch(value,a,n);
        System.out.println("mang sau khi sap xep : ");
        binarySearch.BubbleSort();
        binarySearch.printBubbleSort();
        int found =  binarySearch.binarySearch(value,0,a.length-1);
        System.out.println("Gia tri can tim la : "+ value + "\n"+"tai vi tri : "+found);
    }
}
