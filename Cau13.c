#include <stdio.h>
//Bài 13. Số chia hết lớn nhất.
int main()
{
    int n,a,b;
    printf("nhap a : "); // a = 12
    scanf("%d",&a);
    printf("nhap b : "); // b=3
    scanf("%d",&b);
    if(a%b==0)
    {
        printf("vay so chia het lon nhat la : %d",a);
    }
    else
    {
        int c = a%b;
        printf("vay so chia het lon nhat la : %d",a-c);
    }
}