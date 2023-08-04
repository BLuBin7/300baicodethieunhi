// Bài 162: Cho mảng 1 chiều các số thực. Hãy viết hàm tìm một vị trí trong mảng thỏa 2 điều kiện: 
// có 2 giá trị lân cận và giá trị tại đó bằng tích 2 giá trị lân cận. Nếu mảng không tồn tại giá trị như vậy thì trả về giá trị -1
public class Bai162 {
    int find(float[] a){
        for(int i = 0;i<a.length;i++){
           if(i!=a.length-1 && i!=0){
               if(a[i] == a[i-1] * a[i+1]){
                   return i;
               }
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Bai162 a = new Bai162();
        System.out.println(a.find(new float[]{1,2,6,3,5,6,7,8,9,10}));
    }
}
