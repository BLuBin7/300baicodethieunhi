#include<stdio.h>
#include<math.h>
// Bài 1. 224A(Codeforce)
int main()
{
    int x,y,z,a,b,c;
    printf("nhap dien tich mat x : ");
    scanf("%d",&x);
    printf("nhap dien tich mat y : ");
    scanf("%d",&y);
    printf("nhap dien tich mat z : ");
    scanf("%d",&z);
    b = sqrt(x*y/z);
    a = x/b;
    c = z/b;
    int sum = 4*a +4*b+4*c;
    printf("Vay tong cua 12 canh la : %d\n",sum);
}