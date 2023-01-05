#include<stdio.h>
#include<ctype.h>
//Bài 21. Kiểm tra chữ số.
int main()
{
    int var;
    printf("nhap ki tu : ");
    scanf("%c", &var);
    // //cách 1
    // if(var>=97&&var<=122||var>=65 &&var<=90)
    // {
    //     printf("NO");
    // }
    // //cách 2
    // if(isalpha(var))
    // {
    //     printf("NO");
    // }
    // cách 3
    if((var >='a'&&var<='z')||(var>='A'&&var<='Z'))
    {
        printf("NO");
    }
    else
    {
        printf("YES");
    }
}