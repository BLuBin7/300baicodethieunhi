// Bài 140: Hãy tìm giá trị dương nhỏ nhất trong mảng 1 chiều các số thực. 
// Nếu mảng không có giá trị dương thì sẽ trả về -1

import java.util.ArrayList;
import java.util.List;

public class Bai140 {
    public boolean check(float a) {
        if (a < 0) {
            return false;
        }
        return true;
    }

    public float findDuong(float[] arr) {
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    return arr[i];
                }
            }
            return -1;
        }
    }

    public float find(float[] arr) {
        int count = 0;
        float min = findDuong(arr);
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i]) == true) {
                count++;
                if (min > arr[i]) {
                    min = arr[i];
                    if (i == arr.length - 1) {
                        return min;
                    }
                } 
            }
        }
        if(count >= 1){
            return min;
        }
        return -1;
    }

    public static void main(String[] args) {
        Bai140 a = new Bai140();
        float[] b = { 1.5f, 2.7f, -3.3f, 2.9f, 1.3f };
        System.out.println(a.find(b));
    }
}
