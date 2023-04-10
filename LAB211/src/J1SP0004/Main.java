package J1SP0004;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/10/2023 - 7:57 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n :");
        int n = input.nextInt();

        int[] a = new int[n];

        //Input
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a["+i+"] : " );
            a[i] = input.nextInt();
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + a[i]);
        }

        // QuickSort
//        System.out.println("Nhap gia tri pivot : ");
//        int pivot = input.nextInt();
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort2(a,0,n-1);
        quickSort.print(a);
    }
}
