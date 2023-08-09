// Bài 136: Tìm số chẵn cuối cùng trong mảng 1 chiều các số nguyên. 
// Nếu mảng không có giá trị chẵn thì trả về -1
public class Bai136 {
    public int find(int[] arr) {
        int max = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 ==0) {
        // max = arr[i];
        // }
        // if (i == arr.length - 1) {
        // return max;
        // }
        // }

        // Solution 2
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Bai136 b = new Bai136();
        int[] a = { 1, 2, 3, 9, 5, -6, 7, 3899 };
        System.out.println(b.find(a));
    }
}
