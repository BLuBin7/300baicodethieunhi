// Bài 710: Viết hàm đệ quy tính tổng của biểu thức sau đây:
// S(x, n) = x + x^2/2! + x^3/3! + … + x^n/n!

import java.util.Scanner;

public class Cau710{
    public double giaithua(double number){
        if( number == 0 ){
            return 1.0;
        }
        else{ 
            return number * giaithua(number-1);
        }
    }
    public Double sum(Double number,int n){
        if( n == 0 ){
            return 0.0;
        }
        else{ 
            if(n > 1) return Math.pow(number, n)/(giaithua(n)) + sum(number,n-1);
            else return Math.pow(number, n)/n + sum(number,n-1);
        }
        // return sum(number,n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double number = scanner.nextDouble();
        int n = scanner.nextInt();
        Cau710 cau710 = new Cau710();
        System.out.println(cau710.sum(number,n));
    }
}