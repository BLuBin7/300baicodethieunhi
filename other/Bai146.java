// Bài 146: Tìm giá trị âm đầu tiên trong mảng 1 chiều các số thực. 
// Nếu mảng không có giá trị âm thì trả về -1
public class Bai146 {
    public float find(int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Bai146 a = new Bai146();
        System.out.println(a.find(new int[]{1,-2,3,4,5}));
    }
}
