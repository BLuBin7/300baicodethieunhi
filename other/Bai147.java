// Bài 147: Tìm số dương cuối cùng trong mảng số thực. 
// Nếu mảng không có giá trị dương thì trả về  -1
public class Bai147 {
    public float findDuong(float[] arr){
        for(int i = arr.length-1;i >= 0 ;i--){
            if(arr[i] > 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Bai147 a = new Bai147();
        System.out.println(a.findDuong(new float[]{1, -2, 3, 4, -5}));
    }
}
