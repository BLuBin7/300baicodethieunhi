#include <iostream>
using namespace std;
int main(){
    int n;
    long long s=0;
    cin>>n;
    // long long s =1ll*n*(n+1)/2;// cach1
    // cach 2
    for(long long i = 0; i <= n; i++)
    {
        s = s+i;
    }
    cout<< s;
    return 0;
}