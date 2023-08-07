#include<stdio.h>

void f(int a[], int n, int *comps, int *assigns)
{
int t;
*comp = 0;
*assign = 0;

for (int i = 0; i < n - 1; i++)
{
(*comp)++;
if (a[i] % 2 != 0)
{
for (int j = i + 1; j < n; j++)
{
(*comp)++;
if (a[j] % 2 != 0 && a[i] > a[j])
{
t = a[i];
a[i] = a[j];
a[j] = t;
(*assign) += 3;
}
}

}
}
}

void main()
{
int n = 6;
int a[] = { 4, 5, 1, 3, 6, 2 };
int comp, assign;

f(a, n, &comp, &assign);

printf("\nComp = %d", comp);
printf("\nAssign = %d", assign);
}