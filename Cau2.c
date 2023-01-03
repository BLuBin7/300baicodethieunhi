#include <stdio.h>
#include <math.h>
// Bài 2. Tính toán giá trị biểu thức.
int main()
{
    int x=0,A=0;
    printf("nhap x : ");
    scanf("%d",&x);
    A = x^3 +3*x^2+x+1;
    printf("gia tri cua A la : %d \n",A);
}