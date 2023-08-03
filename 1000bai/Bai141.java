// Bài 141: Hãy tìm vị trí giá trị dương nhỏ nhất trong mảng 1 chiều các số thực. 
// Nếu mảng không có giá trị dương thì trả về  -1
public class Bai141 {
    public boolean check(float a){
        return (a>0) ? true : false;
    }
    public int findDuong(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return i;
            }
        }
        return -1;
    }
    public int findAll(float[] arr){
        int count = 0;
        int minindex = findDuong(arr);
        for(int i = 0; i < arr.length; i++){
            if(check(arr[i]) == true){
                count++;
                if(arr[minindex] > arr[i]){
                    minindex = i;
                }
            }
        }
        if(count >= 1){
            return minindex;
        }
        return -1;
    }
    public static void main(String[] args) {
        Bai141 a = new Bai141();
        System.out.println(a.findAll(new float[] {-1.4f, -2.5f, 3.4f,1.4f}));
    }
}
