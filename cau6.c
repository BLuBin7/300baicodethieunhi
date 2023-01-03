#include <stdio.h>
#include<math.h>
//Bài 6. Tính khoảng cách.
int main()
{
    int i ,j ,g,k,add1,add2,sum =0;
    printf("nhap toa do x cua diem A : ");
    scanf("%d",&i);
    printf("nhap toa do y cua diem A : ");
    scanf("%d",&j);
    printf("nhap toa do x cua diem B : ");
    scanf("%d",&k);
    printf("nhap toa do y cua diem B : ");
    scanf("%d",&g);
    add1 = k-i;
    add2 = g-j;
    printf("toa do x cua doan AB la : %d\n",add1);
    printf("toa do y cua doan AB la : %d\n",add2);
    sum = sqrt((add1)*(add1) +(add2)*(add2));
    printf("khoang cach tu A den B la : %.2f\n",(float)sum);
}