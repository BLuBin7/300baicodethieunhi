// Bài 139: Tìm vị trí số hoàn thiện cuối cùng trong mảng 1 chiều các số nguyên. 
// Nếu mảng không có số hoàn thiện thì trả về giá trị  -1
public class Bai139 {
    public boolean check(int i){
        // flag a
        int a = 1;
        int S = 0;
        // 6 = 1 + 2 + 3
        while(a < i){
            if(i % a == 0){
                S = S + a;
            }
            a++;
        }
        if(S == i){
            return true;
        }
        else{
            return false;
        }
    }
    public int find(int[] arr) {
        int max = 1;
        // for(int i = 0; i < arr.length - 1; i++){
        //     if(check(arr[i]) == true){
        //         max = i;
        //     }
        //     if(i == arr.length){
        //         return max;
        //     }
        // }

        //Solution 2 
        for(int i = arr.length-1;i >=0;i--){
            if(check(arr[i]) == true){
                max = i;
                return max;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Bai139 a = new Bai139();
        int[] b = {2,3,4,5,7};
        System.out.print( a.find(b));
    }
}
