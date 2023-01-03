#include<stdio.h>
// Bài 17. In ra số ngày của tháng
int main()
{
    int t,n;
    printf("nhap thang : ");
    scanf("%d",&t);
    printf("nhap nam : ");
    scanf("%d",&n);
    if(n %400==0||(n%4==0&&n%100!=0))
    {
        if (t<1||t>12)
        {
            printf("INVALID");
        }
        else if (t %2==0&&t!=2)
        {
            printf("30");
        }
        else if(t==2)
        {
            printf("29");
        }
        else
        {
            printf("31");
        }
        
    }
    else
    {
        if (t <1||t >12)
        {
            printf("INVALID");
        }
        else if (t %2==0&&t!=2)
        {
            printf("30");
        }
        else if(t==2)
        {
            printf("28");
        }
        else
        {
            printf("31");
        }
    }
}