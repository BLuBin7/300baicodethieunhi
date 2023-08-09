// Bài 148: Tìm số nguyên tố cuối cùng trong mảng 1 chiều các số nguyên. 
// Nếu mảng không có số nguyên tố thì trả về  -1
public class Bai148 {
    public boolean check(int i) {
        if (i < 2) {
            return false;
        } else if (i > 2) {
            if (i % 2 == 0) {
                return false;
            }
            for (int j = 3; j < Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int find(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (check(arr[i]) == true) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Bai148 b = new Bai148();
        System.out.println(b.find(new int[] { 1, -2, 3, 4, 5 }));
    }
}
