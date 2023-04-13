package J1SP0006;

/**
 * Created by Binh
 * Date : 4/13/2023 - 10:14 PM
 * Description :
 */
public class BinarySearch {
    private int value;
    private int[] a;
    BinarySearch(int value,int[] a){
        this.value = value;
        this.a = a;
    }
    void binarySearch(int mid, int left, int right){
        for (int i = 0; i < a.length; i++) {
            left =  i;
            right = a.length;
            mid = i + (right-left)/2 ;
            if(a[value]  > a[mid]){
                binarySearch( mid, mid -1,right);
            }
            else {
                binarySearch( mid, left, mid +1);
            }

        }
    }
}
