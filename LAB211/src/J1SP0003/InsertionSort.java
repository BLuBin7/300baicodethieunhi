package J1SP0003;

/**
 * Created by Binh
 * Date : 4/9/2023 - 1:20 AM
 * Description :
 */
public class InsertionSort {

    /**
     * Insertion sort.
     *
     * @param a the a
     */
    void InsertionSort(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            for (int j = i+1; j < a.length; j++) {
                if( a[i]>a[j] ){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                else {
                    continue;
                }
            }
        }
        System.out.println("");
    }

    /**
     * Print.
     *
     * @param a the a
     */
    static void print(int[] a) {
            System.out.print("Sorted array: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
    }
}
