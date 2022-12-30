#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
    int n;
    long long sum = 0;
    printf("nhap n : ");
    scanf("%d", &n);
    for(long long i = 0; i <= n; i++)
    {
        sum = sum+i;
    }
    printf("gia tri tong la : %lld",sum);
}