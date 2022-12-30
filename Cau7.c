#include<stdio.h>
#include<math.h>
//Bài 7. Chuyển đơn vị đo C và F
int main()
{
    int C;
    float F;
    printf("nhap C : ");
    scanf("%d", &C);
    // khong dc de ham F trc khi nhap C
    F = (C * 1.8) + 32;
    // neu de la 5/9 thi se sai nen de 1.8
    printf("nhiet do F la : %.2f",F);
    return 0;
}