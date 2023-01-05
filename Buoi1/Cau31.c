#include<stdio.h>
// Bài 31. Kết quả học tập.
int main()
{
    double a,b,c,d;
    printf("nhap diem he so 1 lan 1 : ");
    scanf("%lf",&a);
    printf("nhap diem he so 2 lan 2 : ");
    scanf("%lf",&b);
    printf("nhap diem he so 2 : ");
    scanf("%lf",&c);
    printf("nhap diem he so 3 : ");
    scanf("%lf",&d);
    double average=(a+b+c*2+d*3)/7;
    if(average >=8)
    {
        printf("GIOI");
    }
    else if(average<8&&average>6.5)
    {
        printf("KHA");
    }
    else if(average <6.5&&average>=5)
    {
        printf("TRUNG BINH");
    }
    else
    {
        printf("YEU");
    }
}