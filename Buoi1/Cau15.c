#include<stdio.h>
//Bài 15. Kiểm tra số chia hết cho 3 và 5.
int main()
{
    int n;
    printf("nhap n : ");
    scanf("%d", &n);
    if(n%3==0&&n%5==0)
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
}