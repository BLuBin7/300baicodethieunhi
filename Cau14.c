#include<stdio.h>
//Bài 14. Số chia hết nhỏ nhất.
int main()
{
    int a,b;
    printf("nhap a: ");
    scanf("%d",&a);
    printf("nhap b: ");
    scanf("%d",&b);
    if(a%b==0) 
    {
        printf("vay so chia het nho nhat la: %d",a);
    }
    else
    {
        int c = a/b;
        int d = (c+1)*b;
        printf("vay so chia het nho nhat la: %d",d);
    }
}