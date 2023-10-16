#include<stdio.h>
// Bài 3. 1A(CodeForce)
int main()
{
    int M,N,H,K,L,a;
    printf("nhap M : ");
    scanf("%d",&M);
    printf("nhap N : ");
    scanf("%d",&N);
    printf("nhap a : ");
    scanf("%d",&a);
    if(M%a != 0 && N%a != 0) 
    {
        K = M/a;
        H = M*N-(M-(M%a))*a;
        L = H/N;
        printf("So gach can lat it nhat la : %d\n",K+L);
    }
    else if(M%a == 0&&N%a != 0)
    {
        K = M/a;
        H = M*N-M*a;
        L = H/a;
        printf("So gach can lat it nhat la : %d\n",K+L);
    }
    else if(M%a == 0&&N%a == 0)
    {
        K = M/a;
        L = N/a;
        printf("So gach can lat it nhat la : %d\n",K*L);
    }
}