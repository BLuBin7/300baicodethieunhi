#include<stdio.h>
//Bài 24. Chữ cái kế tiếp.
int  main()
{
    int a;
    printf("nhap ki tu in hoa: ");
    scanf("%c", &a);
    if(a==90)
    {
        printf("ki tu tiep theo in thuong la : %c",97);
    }
    else if(a>=65&&a<=90)
    {
        printf("ki tu tiep theo in thuong la : %c",a+33);
    }
    else if(a>=97&&a<=122)
    {
        printf("ki tu tiep theo in thuong la : %c",a+1);
    }
    else
    {
        printf("INVALID");
    }
}