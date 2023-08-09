// Bài 144: Tìm số nguyên tố đầu tiên trong mảng 1 chiều các số nguyên. Nếu mảng không có số nguyên tố thì trả về  – 1
public class Bai144 {
   public boolean check(int i) {
      int n = 1;
      int count = 0;
      while (n <= i) {
         if (i % n == 0) {
            count++;
         }
         n++;
      }
      return (count > 2 ) ? false : true;
   }

   // Solution 2
   public boolean KiemTraNguyenTo(int n) {
      if (n < 2) {
         return false;
      } else if (n > 2) {
         if (n % 2 == 0) {
            return false;
         }
         for (int i = 3; i <= Math.sqrt((float) n); i += 2) {
            if (n % i == 0) {
               return false;
            }
         }
      }
      return true;
   }

   public int find(int[] a) {
      for (int i = 0; i < a.length; i++) {
         if (check(a[i]) == true && a[i] > 2) {
            return a[i];
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      Bai144 a = new Bai144();
      System.out.println(a.find(new int[] { 6, 6, 8, 21, 5 }));
   }
}
