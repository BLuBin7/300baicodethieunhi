// Bài 156: Hãy tìm giá trị trong mảng các số thực gần giá trị x nhất
public class Bai156 {
    float find(float[] a, float x){
        float min = a[0];
        for(int i = 0 ; i < a.length ; i++){
            if(min - x > a[i]-x ){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(new Bai156().find(new float[]{1, 2, 3, 4, 5}, 3));
    }
}
