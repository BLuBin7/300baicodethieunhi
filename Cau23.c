#include<stdio.h>
//Bài 23. Chuyển kí tự thường thành kí tự hoa
int main()
{
    char a;
    printf("nhap ki tu thuong : ");
    scanf("%c", &a);
    if(a>=97&&a<=122)
    {
        printf("ki tu in hoa la : %c",a-32);
    }
    else
    {
        printf("ki tu in hoa la : %c",a);
    }
}