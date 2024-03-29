package J1SP0004;


/**
 * Created by Binh
 * Date : 4/10/2023 - 8:06 PM
 * Description :
 */
public class QuickSort {


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

    /**
     * Partition int.
     *
     * @param a     the a
     * @param left  the left
     * @param right the right
     * @return the int
     */
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
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }


    /**
     * Quick sort 2.
     *
     * @param arr   the arr
     * @param left  the left
     * @param right the right
     */
    void quickSort2(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort2(arr, left, index - 1);
        }
        if (index < right) {
            quickSort2(arr, index, right);
        }
    }


    /**
     * Print.
     *
     * @param a the a
     */
    void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
