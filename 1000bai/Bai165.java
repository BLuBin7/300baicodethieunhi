// Bài 165: Cho mảng 1 chiều các số nguyên. Hãy tìm giá trị đầu tiên có chữ số đầu tiên là chữ số lẻ
public class Bai165 {
    int find(int[] a){
        for(int i=0; i<a.length; i++){
            if((a[i]/10)%2 != 0 && a[i]>=10){
                return a[i];
            }
            else if(a[i]<10 && a[i]%2!=0){
                return a[i];
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        Bai165 a = new Bai165();
        System.out.println(a.find(new int[]{2,2,2,23,5}));
        System.out.println(11/10);
    }
}
