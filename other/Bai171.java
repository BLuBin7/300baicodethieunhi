// Bài 171: Cho mảng 1 chiều các số nguyên. 
// Hãy viết hàm tìm ước chung lớn nhất của tất cả các phần tử trong mảng
public class Bai171 {
    int findMin(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i]; 
            }
        }
        return min;
    }

    int findUCLN(int a[]){
        int Uocchung = findMin(a);
        for(int i = 0 ; i < a.length; i++){
            if(a[i] % Uocchung != 0&& a[i] >1){
                i = -1;
                return Uocchung - findMin(a);
            }
        }
        return-1;

    }

    public static void main(String[] args) {
        Bai171 a = new Bai171();
        System.out.println(a.findUCLN(new int[]{2,3,6,9}));
    }
}
