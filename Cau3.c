#include <stdio.h>
// Bài 3. Tính toán giá trị biểu thức 2
int main()
{
    int a,b,c,S;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("nhap c : ");
    scanf("%d",&c);
    S = a*(b+c) + b*(a+c);
    printf("gia tri cua S la : %d",S);
}