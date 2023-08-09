// Bài 158: Cho mảng 1 chiều các số thực, hãy tìm giá trị x sao cho đoạn [-x, x] chứa tất cả các giá trị trong mảng

import java.util.ArrayList;
import java.util.List;

public class Bai158 {
    public String find(float[] a) {
        float min = a[0];
        float max = a[0];
        List<Float> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            } else if (max < a[i]) {
                max = a[i];
            }
            if (i == a.length - 1) {
                if (min <= 0) {
                    if (Math.abs(min) > Math.abs(max)) {
                        list.add(min);
                        max = -min;
                        list.add(max);
                    }
                    else {
                        min = -max;
                        list.add(min);
                        list.add(max);
                    }
                } else if (min > 0) {
                    min = -max;
                    list.add(min);
                    list.add(max);
                }
            }
        }
        return "[" + list.get(0) + "," + list.get(1) + "]";
    }

    public static void main(String[] args) {
        Bai158 b = new Bai158();
        System.out.println(b.find(new float[] { 0f, 2.9f, 0.9f, -44.2f, 55.6f}));
    }
}
