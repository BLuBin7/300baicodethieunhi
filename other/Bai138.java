// Bài 138: Tìm vị trí của giá trị chẵn đầu tiên trong mảng 1 chiều các số nguyên. Nếu mảng không có giá trị chẵn thì sẽ trả về -1
public class Bai138 {
    public int find(int[] arr){
        for(int i = 0;  i<arr.length; i++){
            if(arr[i] % 2 == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Bai138 b = new Bai138();
        int[] a = { 1, 3, 3, 9, 5, -6, 7, 3899 };
        System.out.println(b.find(a));
    }
}
