#include<stdio.h>
//Bài 11. Tính tổng 4
int main (){
    int n;  long long sum = 0; 
    printf("nhap n : ");
    scanf("%d",&n);
    for(int i=1; i<=n; i++)
    {
        sum += i*2;
    }
    printf("tong la : %lld\n",sum);
}