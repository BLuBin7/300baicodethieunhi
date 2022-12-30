#include<stdio.h>
#include<math.h>
// Bài 5. Tính chu vi, diện tích hình tròn
int main()
{
    int r;
    printf("nhap ban kinh r : ");
    scanf("%d",&r);
    printf("chu vi hinh tron la %.2f\n",(float)2*r*M_PI);
    printf("dien tich hinh tron la %.2f\n",(M_PI)*(M_PI)*r);
    // double ceil ( double ); => Hàm này sẽ chỉ luôn luôn làm tròn lên
    // double floor ( double ); => Ngược lại với hàm này sẽ chỉ luôn luôn làm tròn xuống.
    // int a1 = ceil(a);
    // int a2 = floor(a); 
    // có thể dùng round(a);
    return 0;
}