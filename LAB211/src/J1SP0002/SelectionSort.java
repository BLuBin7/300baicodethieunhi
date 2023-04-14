package J1SP0002;

/**
 * Created by Binh
 * Date : 4/8/2023 - 10:32 PM
 * Description :
 */


public class SelectionSort {


    /**
     * Selection sort.
     *
     * @param a the a
     * @param n the n
     */
    void SelectionSort(int[] a, int n ){
        // xet toi n-1 thoi
        // vd: 1 mang 8 phan tu, neu i < n , khi i = 7 thi j = 8( mà đk là j<n) se ko hop li
        for ( int i = 0; i < n-1; i++){
            int min = i;
            // nếu j = 1 và i for ở trên với i<n
            // khi i = 7, thì j = 7 , khi đó i với j sẽ bị swap cho nhau -> sai
            for (int j = i+1; j < n; j++) {
                    if(a[min] > a[j]) {
                        min = j;
                    }
            }
            if (min != i) {
                // Option 1
//                int temp = a[min];
//                a[min] = a[i];
//                a[i] = temp;
                // Option 2
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
            if(i==1) break;
        }
        System.out.println();
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
