#include<stdio.h>
//Bài 30. Phép chia.
int main()
{
    int a,b,c;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("nhap c : ");
    scanf("%d",&c);
    if(a/b==c||b/c==a||c/a==b)
    {
        printf("/");
    }
    else
    {
        printf("NOSOL");
    }
}