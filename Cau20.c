#include<stdio.h>
#include<ctype.h>
//Bài 20. Kiểm tra chữ cái
int main()
{
    char var;
    printf("nhap ki tu : ");
    scanf("%c", &var);
    // char c = (char)65;
    // printf("%c\n", c); // sẽ in ra kí tự 'A'
    //cách 1
    if ((var>=97 && var<=122)|| (var>=65 && var<90 ))
    {
        printf("YES");
    }
    //cách 2
    // if ((var >= 'a' && var<= 'z') || (var >= 'A' && var <= 'Z')) 
    // {
    //     printf("YES");
    // }
    //cách 3
    // if(isalpha(var))
    // {
    //     printf("YES");
    // }
    else
    {
        printf("NO");
    }

}