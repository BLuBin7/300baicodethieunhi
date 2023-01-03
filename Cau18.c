#include<stdio.h>
#include<ctype.h>
// Bài 18. Kiểm tra chữ in thường.
/*Tất cả các ký tự chữ thường (a đến z) có các giá trị ASCII nằm trong khoảng từ  
97 đến 122 , khoảng cách các chữ hoa với thường là 32 ,vd a(97) thì A(65)*/
int main()
{
    char var;
    printf("nhap ki tu : ");
    scanf("%c", &var);
    //cách 1
    // if(var==tolower(var)) 
    // {
    //     printf("YES");
    // }
    //cách 2
    if(var>=97&&var<=122) 
    {
        printf("YES");
    }
    else 
    {
        printf("NO");
    }
}