package J1SP0005;

/**
 * Created by Binh
 * Date : 4/11/2023 - 9:09 PM
 * Description : Merge Sort
 */
public class MergeSort {
    private int[] array;
    private int[] tempMergArr;
    private int length;
    MergeSort(int[] array,int[] tempMergArr,int length){
        this.array = array;
        this.tempMergArr = tempMergArr;
        this.length = length;
    }
    void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex,tempMergArr);
        }
    }
    private void mergeParts(int lowerIndex, int middle, int higherIndex, int[] tempMergArr) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }

    void print(int[] array){
        System.out.print("\n[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
