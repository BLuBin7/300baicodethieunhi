#include<stdio.h>
#include<math.h>
//Bài 26. Kiểm tra tam giác
int main()
{
    int a,b,c;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("nhap c : ");
    scanf("%d",&c);
    if((a+b<c)||(a+c<b)||(b+c<a))
    {
        printf("INVALID");
    }
    else if(a==b&&a==c&&b==c)
    {
        printf("Tam giac deu ");
    }
    else if(a==b||a==c||b==c)
    {
        printf("Tam giac can ");
    }
    else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
    {
        printf("Tam giac vuong ");
    }
    else 
    {
        printf("Tam giac thuong ");
    }
}