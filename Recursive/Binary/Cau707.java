// Bài 707: Viết hàm đệ quy tính số hạng thứ n của dãy Fibo

import java.util.Scanner;

public class Cau707 {
    public long Fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Cau707 c = new Cau707();
        System.out.println(c.Fibo(n));
    }
}
