#include<stdio.h>
// Bài 32. Số nhỏ thứ 2
int main()
{
    int a,b,c,d,e,min1,min2;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("nhap c : ");
    scanf("%d",&c);
    printf("nhap d : ");
    scanf("%d",&d);
    printf("nhap e : ");
    scanf("%d",&e);
    if (a < b) {
        min1 = a;
        min2 = b;
    } else {
        min1 = b;
        min2 = a;
    }

    if (c < min1) {
        min2 = min1;
        min1 = c;
    } else if (c < min2) {
        min2 = c;
    }

    if (d < min1) {
        min2 = min1;
        min1 = d;
    } else if (d < min2) {
        min2 = d;
    }

    if (e < min1) {
        min2 = min1;
        min1 = e;
    } else if (e < min2) {
        min2 = e;
    }

    printf("So nho thu 2 la: %lld\n", min2);

    return 0;
}