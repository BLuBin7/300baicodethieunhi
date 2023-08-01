// Bài 704: Cho mảng 1 chiều các số nguyên. 
// Viết hàm tính tổng các số chẵn trong mảng bằng phương pháp đệ quy

import java.util.Scanner;

public class Cau704 {
    public int Sum(int[] a, int n) {
        if (n == 0)
            return 0;
        
        if (a[n - 1] % 2 == 0)
            return a[n - 1] + Sum(a, n - 1);
        return Sum(a, n - 1);
    }

    public static void main(String[] args) {
        Cau704 cau704 = new Cau704();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        int result = cau704.Sum(a , n);
        System.out.println("result:"+result);
    }
}
