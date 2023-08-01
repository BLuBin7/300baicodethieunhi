// Bài 705: Cho mảng 1 chiều các số thực. 
// Viết hàm đếm số lượng giá trị dương trong mảng bằng phương pháp đệ quy

import java.util.Scanner;

public class Cau705 {
    public int Sum(int[] a, int n){
        if(n==0){
            return 0;
        }
        if(a[n-1] > 0){
            return 1 + Sum(a, n-1);
        }
        return Sum(a, n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        Cau705 cau705 = new Cau705();
        int result = cau705.Sum(a, n);
        System.out.println("result :"+result);
    }
}
