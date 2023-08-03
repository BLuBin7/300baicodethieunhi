// Bài 142: Tìm giá trị nhỏ nhất trong mảng 1 chiều số thực
public class Bai142 {
    public float findmin(float[] a){
        float min = a[0];
        for (int i = 0; i < a.length; i++) {
           if(min>a[i]){
               min = a[i];
           }
        }
        return min;
    }
    public static void main(String[] args) {
        Bai142 a = new Bai142();
        System.out.println(a.findmin(new float[] {1.4f, 2.5f, 3.4f,1.4f}));
    }
}
