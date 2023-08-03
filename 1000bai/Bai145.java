// Bài 145: Tìm số hoàn thiện đầu tiên trong mảng 1 chiều số nguyên. Nếu mảng không có số hoàn thiện thì trả về  -1
public class Bai145 {
    public boolean check(int i ){
        int n = 1;
        int S = 0;
        while(n<i){
            if(i%n==0){
                S = S + n;
            }
            n++;
        }
        if(S == i){
            return true;
        }
        else{
            return false;
        }
    }
    public int find(int[] a){
        for(int i = 0;i<a.length;i++){
            if(check(a[i])==true){
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Bai145 a = new Bai145();
        System.out.println(a.find(new int[]{1,2,3,4,6}));
    }
}
