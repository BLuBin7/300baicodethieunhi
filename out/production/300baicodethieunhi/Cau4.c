#include<stdio.h>
// Bài 4. Frog
int main()
{
    int c = 0; int a,b,x,i;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("nhap x : ");
    scanf("%d",&x);
    for(i= 0; i < x; i++)
    {
        if(i %2==0 || i==0)
        {
            c = c +a;
        }
        else
        {
            c = c - b;
        }
    }
    printf("Vi tri con ech hien tai la : %d\n",c);
}