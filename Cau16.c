#include<stdio.h>
// Bài 16. Kiểm tra năm nhuận
int main()
{
    int nam;
    printf("nhap so nam can tinh : ");
    scanf("%d", &nam);
    if(nam%400==0||(nam%4==0&&nam%100!=0))
    {
        printf("YES");
    }
    else if (nam<=0)
    {
        printf("INVALID");
    }
    else
    {
        printf("NO");
    }
}