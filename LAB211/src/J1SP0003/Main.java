package J1SP0003;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/9/2023 - 1:20 AM
 * Description :
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = input.nextInt();

        int a[] = new int[n];
        // Input
        for(int i = 0; i < n;i++){
            System.out.print("a["+i+"] : ");
            a[i] = input.nextInt();
        };
        // Output
        System.out.print("Unsorted Array :");
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+a[i]);
        }
        InsertionSort insertion = new InsertionSort();
        insertion.InsertionSort(a);
        insertion.print(a);
        }
    }

