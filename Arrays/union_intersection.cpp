//Find the Union and Intersection of the two sorted arrays.


#include <bits/stdc++.h>
using namespace std;
void Union(int a[],int b[],int n,int m)
{
    unordered_set<int> un;
    for(int i=0;i<n;i++)
         un.insert(a[i]);
    for(int i=0;i<m;i++)
         un.insert(b[i]);
         cout<<"The union of two soreted array is: ";
    for(int i: un)
         cout<<i<<" ";
    cout<<endl;
}
void intersection(int a[],int b[],int n,int m)
{
    int i,j;
    i=0,j=0;
    unordered_set<int> in;
    while(i<n && j<m)
    {
        if(a[i]<b[j])
            i++;
        else if(a[i]>b[j])
            j++;
        else
        {
            in.insert(a[i]);
            i++;j++;
   
        }
    }
    cout<<"The intersection of two soreted array is: ";
    for(auto ele:in)
       cout<<ele<<" ";
}
int main()
{
    int n;
    cout<<"Enter the size of the element: ";
    cin>>n;
    int a[n];
    cout<<"Enter the elements of n sized array: ";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
     int m;
    cout<<"Enter the size of the element: ";
    cin>>m;
    int b[m];
    cout<<"Enter the elements of m sized array: ";
    for(int i=0;i<m;i++)
    {
        cin>>b[i];
    }
    Union(a,b,n,m);
    intersection(a,b,n,m);
    return 0;
}