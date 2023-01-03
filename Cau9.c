#include <stdio.h>
// Bài 9. Tính tổng 2.
int main()
{
    int n;
    printf("nhap n :");
    scanf("%d", &n);
    long long sum=0;
    for(long long i=0; i<=n;i++)
    {
        sum = sum +i*i;
    }
    printf("tong la : %lld",sum);
    return 0;
}