// ài 137: Tìm 1 vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất trong mảng 1 chiều các số thực
public class Bai137 {
    public int findmin(float[] arr){
        float minvalue = arr[0];
        int indexmin = 0;
        for (int i = 0; i < arr.length; i++) {
            if(minvalue > arr[i]){
                minvalue = arr[i];
                indexmin = i;
            }
        }
        return indexmin;
    }
    public static void main(String[] args) {
       Bai137 cau137 = new Bai137();
       float[] arr = {21.5f,2.7f,3.3f,4.9f,5.3f};
       System.out.println(cau137.findmin(arr));
    }
}
