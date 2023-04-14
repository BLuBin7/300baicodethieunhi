package J1SP0006;

/**
 * Created by Binh
 * Date : 4/13/2023 - 10:14 PM
 * Description :
 */
public class BinarySearch {
    private int value;
    private int[] a;
    private int n;

    /**
     * Instantiates a new Binary search.
     *
     * @param value the value
     * @param a     the a
     * @param n     the n
     */
    BinarySearch(int value,int[] a, int n){
        this.value = value;
        this.a = a;
        this.n = n;
    }


    /**
     * Bubble sort.
     */
    void BubbleSort(){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i -1  ; j++) {
                if(a[j] > a[j+1]){
// không được tạo hàm swap như này nếu muốn swap 2 số liên tiếp trong 1 vòng for
// thì cần phải ghi hàm trực tiếp trong lúc swap luôn, không nên ghi hàm swap trong Java
                    // Java is Pass-by-Valua( truyền giá trị )
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    /**
     * Print bubble sort.
     */
    void printBubbleSort(){
        for (int i = 0; i < n; i++) {
            System.out.println("\t"+a[i]);
        }
    }

    /**
     * Binary search
     *
     * @param mid   the mid
     * @param left  the left
     * @param right the right
     * @return the int
     */
    int binarySearch(int mid, int left, int right){
            if (left > right) {
                return -1;
            }
            mid = (right-left)/2 ;
            if (a[mid] == value) {
                return mid;
            }
            else if(value  > a[mid]){
                return binarySearch( mid, mid + 1,right);
            }
            else {
                return binarySearch( mid, left, mid -1);
            }
    }
}
