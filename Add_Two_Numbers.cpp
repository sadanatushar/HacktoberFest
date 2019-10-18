#include<iostream>
using namespace std;
int main()
{
    int n,t,i,a[100],b[100];
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a[i]>>b[i];
    }
    for(i=0;i<n;i++)
    {
        t=a[i]+b[i];
        cout<<t<<"\n";
    }
return 0;
}