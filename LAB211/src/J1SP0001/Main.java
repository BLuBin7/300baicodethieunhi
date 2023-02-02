package J1SP0001;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/8/2023 - 9:56 PM
 * Description :
 */
public class Main {
    /**
     * The Sc.
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("nhap so luong muon sap xep : ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
//          lưu phần tử
            arr[i] = sc.nextInt();
        }

        System.out.println("Các phần tử của mảng sau khi sort: ");
        BubbleSort(arr);
        print(arr);

    }

    /**
     * Bubble sort.
     *
     * @param arr the arr
     */
    public static void BubbleSort(int[] arr)
    {
        int i, j,u;
        System.out.print("Unsorted array: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for ( i = 0; i < arr.length; i++) {
            for ( j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    private static void print(int[] a) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
