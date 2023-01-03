#include <stdio.h>
// Bài 10. Tính tổng 3.
int main(void)
{
    int n;
    double sum=0;
    printf("nhap n :");
    scanf("%d", &n);
    for(int i=1; i<=n;i++)
    {
        sum += 1.0 / (i*(i+1));
    }
    printf("tong la : %.2f",sum);
    return 0;
}