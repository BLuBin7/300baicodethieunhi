package J1SP0002;

import java.sql.Array;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/8/2023 - 10:03 PM
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
        System.out.print("nhap n : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        // Input
        for(int i = 0 ;i < n;i++){
            System.out.print("Nhap a["+i + "] : ");
            arr[i] = input.nextInt();
        }

        // Output
        try {
            for (int i = 0; i < n; i++) {
                if (i < n) {
                    System.out.println();
                    System.out.print(arr[i]);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        SelectionSort selectionSort = new SelectionSort();

        selectionSort.SelectionSort(arr,n);
        selectionSort.print(arr);



    }
}
