// Bài 143: Viết hàm tìm số chẵn đầu tiên trong mảng các số nguyên. Nếu mảng không có giá trị chẵn thì trả về  -1
public class Bai143 {
    public int find(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Bai143 b = new Bai143();
        System.out.println(b.find(new int[]{1,2,3,4,5}));
    }   
}
