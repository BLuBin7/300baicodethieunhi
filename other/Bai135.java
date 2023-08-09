// Bài 135: Viết hàm tìm giá trị dương đầu tiên trong mảng 1 chiều các số thực. 
// Nếu mảng không có giá trị dương thì trả về -1

public class Bai135 {
    public float find(float[] arr ){
       for(int i = 0 ; i < arr.length;i++){
           if(arr[i] > 0){
               return arr[i];
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Bai135 b = new Bai135();
        float [] a = {-1.5f,-2.7f,3.3f,4.9f,-5.3f};
        System.out.println(b.find(a));
    }
}
