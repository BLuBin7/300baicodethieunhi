#include<stdio.h>
#include<ctype.h>
//Bài 22. Chuyển ký tự hoa thành thường.
int main()
{
    char a;
    printf("nhap ki tu in hoa : ");
    scanf("%c",&a);
    if(a>=65&&a<=90)
    {
        printf("ki tu in thuong la : %c",a+32);
    }
    else
    {
        printf("ki tu in thuong la : %c",a);
    }
}