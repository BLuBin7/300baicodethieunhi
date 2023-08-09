// Bài 155: Hãy tìm giá trị trong mảng các số thực xa giá trị x nhất
public class Bai155 {
    float find(float[] arr, float x) {
        float temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - x > temp - x) {
                temp = arr[i];
            }
            if (i == arr.length - 1) {
                return temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Bai155 a = new Bai155();
        System.out.println(a.find(new float[] { -1.4f, 2.5f, 3.4f, 4.4f }, 1.4f));
    }
}
