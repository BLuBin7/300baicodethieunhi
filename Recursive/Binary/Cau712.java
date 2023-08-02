// Bài 712: Viết hàm tính số hạng thứ n của hai dãy sau:

// X(0) = 1
// Y(0) = 0
// X(n) = x(n – 1) + y(n – 1) (n > 0)
// Y(n) = 3 * x(n – 1) + 2 * y(n – 1) (n > 0)

public class Cau712 {

    long sumX(int n) {
        return (n==0)?1 : sumX(n - 1) + sumY(n - 1);
    }

    long sumY(int n) {
        return (n == 0) ? 0 : 3 * sumX(n - 1) + 2 * sumY(n - 1);
    }

    public static void main(String[] args) {
        Cau712 cau712 = new Cau712();
        System.out.println(cau712.sumX(5));
    }
}
