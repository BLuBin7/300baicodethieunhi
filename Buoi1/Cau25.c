#include<stdio.h>
#include<math.h>
// Bài 25. Tam giác hợp lệ.
int main()
{
    int a,b,c;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("nhap c : ");
    scanf("%d",&c);
    if(a+b>=c&&a+c>=b&&b+c>=a) 
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }
}