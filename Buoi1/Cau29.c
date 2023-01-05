#include<stdio.h>
// Bài 29. Số thuộc đoạn.
int main()
{
    float a,b;
    printf("nhap a : ");
    scanf("%f",&a);
    printf("nhap b : ");
    scanf("%f",&b);
    int c=(int)b-a+1;
    printf("%d",c);
}