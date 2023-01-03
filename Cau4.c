#include <stdio.h>
#include <math.h>
// Bài 4. Tính tổng, hiệu, tích, thương.
int main()
{
    int a,b;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("gia tri phep cong la : %d\n",a+b);
    printf("gia tri phep tru la : %d\n",a-b);
    printf("gia tri phep nhan la : %d\n",a*b);
    printf("gia tri phep chia la : %.2f\n",(float)a/b); // ep kieu float va lay sau dau "," 2 chu so
    printf("%.10f",M_PI); // so pi pi pi pi pi pi pi pi pi 
    return 0;
}