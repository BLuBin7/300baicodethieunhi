#include <stdio.h>
// Bài 1. Phần nguyên, phần dư
int main()
{
    int i,n,j,m;
    printf("nhap so can chia : " );
    scanf("%d",&n);
    printf("nhap so bi chia : ");
    scanf("%d",&m);
    printf("phan nguyen la : %d\n",div(n,m)); // phần nguyên
    printf("phan du la : %d",n%m);// phần dư
    return 0;
}