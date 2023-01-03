#include <stdio.h>
////Bài 12. Tính tổng 5
int main() {
  // Khai báo biến n là số phần tử của dãy số
  long long n;
  // Nhập giá trị của n
  scanf("%lld", &n);

  // Tính tổng dãy số theo công thức tổng dãy số vô hướng
  long long sum = (n/2) * (-1 + n);

  // In ra kết quả tổng
  printf("%lld\n", sum);

  return 0;
}
