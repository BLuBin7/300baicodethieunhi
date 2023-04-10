package J1SP0004;

/**
 * Created by Binh
 * Date : 4/10/2023 - 8:06 PM
 * Description :
 */


public class QuickSort {

    void swap(int i , int j, int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void quicksort(int[] a ,int pivot,int n){
        int j=0;
        // nên để n-1 để không bị Exception : ArrayIndexOutOfBoundsException
        for (int i = 0; i < n-1; i++) {
            if(a[i] > a[pivot]) {
//                continue;
            }
            else{
                 j++;
                if(a[i] > a[j]){
                    swap(j, i, a);
                }
                else if (a[i]==a[j]) {
//                    continue;
                }
            }
        }
        System.out.println(" ");
    }

    void partition(int[] a , int left , int right){
        int i = left;
        int j = right;
        int pivot = a[(left + right) / 2];
        while(i<=j){
            while(a[i] < a[pivot]){
                i++;
            }
            while(a[j] > a[pivot]){
                j--;
            }
            if(i<=j){
                swap(i,j,a);
                i++;
                j--;
            }
        }
    }




    void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
