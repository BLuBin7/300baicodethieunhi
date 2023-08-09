// Bài 157: Cho mảng 1 chiều các số thực, 
// hãy tìm đoạn [a, b] sao cho đoạn này chứa tất cả các giá trị trong mảng

import java.util.List;
import java.util.Vector;

public class Bai157 {
    String find (float[] a){
        float min = a[0],max = a[0] ;
        List<Float> result = new Vector<Float>();
        for(int i = 0; i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            else if(a[i]>max){
                max = a[i];
            }
            if(i == a.length-1){
                result.add(min);
                result.add(max);
            }
        }
        return "["+ result.get(0) +"," + result.get(1)+"]";
    }
    public static void main(String[] args){
        Bai157 a = new Bai157();
        System.out.println(a.find(new float[]{78.9f,2.7f,8f,9f,9910f}));
    }
}
