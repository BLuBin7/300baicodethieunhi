#include<stdio.h>
// Bài 2. 50A(CodeForce)
int main()
{
    int M,N,K,L;
    printf("nhap M : ");
    scanf("%d",&M);
    printf("nhap N : ");
    scanf("%d",&N);
    if(M%2 != 0) 
    {
        K = N*(M/2);
        if(N%2 != 0)
        {
            L = N-2;
        }
        else
        {
            L = 2;
        }
    }
    else
    {
        K = N*(M/2);
        L = 0;
    }
    printf("So khoi domino nhieu nhat la : %d\n",K+L); 
    return 0;
}