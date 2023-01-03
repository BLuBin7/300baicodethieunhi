#include<stdio.h>
#include<math.h>
int main()
{
    int a,b,c,y,x;
    printf("nhap a : ");
    scanf("%d",&a);
    printf("nhap b : ");
    scanf("%d",&b);
    printf("nhap c : ");
    scanf("%d",&c);
    double delta = b*b - 4*a*c;

    if (delta < 0) {
    // phương trình vô nghiệm
        printf("Phuong trinh vo nghiem!\n");
    } else if (delta == 0) {
    // phương trình có nghiệm kép
        double x = -b / (2*a);
        printf("Phuong trinh co nghiem kep : %.2lf\n", x);
    } else {
    // phương trình có 2 nghiệm phân biệt
        double x1 = (-b + sqrt(delta)) / (2*a);
        double x2 = (-b - sqrt(delta)) / (2*a);
        printf("Phuong trinh co 2 nghiem: x1 = %.2lf, x2 = %.2lf\n", x1, x2);
    }
    return 0;
}
    