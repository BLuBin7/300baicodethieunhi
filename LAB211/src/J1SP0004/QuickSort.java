package J1SP0004;

/**
 * Created by Binh
 * Date : 4/10/2023 - 8:06 PM
 * Description :
 */


public class QuickSort {

    void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

//    void quickSort(int[] a ,int pivot,int n){
//        int j=0;
//        // nên để n-1 để không bị Exception : ArrayIndexOutOfBoundsException
//        for (int i = 0; i < n-1; i++) {
//            if(a[i] > a[pivot]) {
//                continue;
//            }
//            else if(a[i] <= a[pivot]){
//                j++;
//                if(a[i] > a[j]){
//                    swap(j, i, a);
//                }
//                else if (a[i] == a[j]) {
//                    continue;
//                }
//            }
//        }
//        System.out.println(" ");
//    }

    int partition(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int pivot = a[(left + right) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j, a);
                i++;
                j--;
            }
        }
        return i;
    }



    void quickSort2(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort2(arr, left, index - 1);
        }
        if (index < right) {
            quickSort2(arr, index, right);
        }
    }



    void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
