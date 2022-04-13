//-----------------AMAZON,ORACLE---------------------------------
/*Given the array arr[] of size N. The task is to find the 1st repeating element in the array of integers,
i.e. an element that occus more than once and whose index of the first occurrence is smallest.
Constrains:
1<=N<=10^6
0<=Ai<=10^6

Input:
7
1 5 3 4 3 5 6
Output:
2
(5 is appearing twice and its first appearence is at inde 2 which is less than 3 whose first occurring index is 3)
*/

// Time Complexity-O(n^2)

// #include<iostream>
// using namespace std;
// int main()
// {
//     int n;
//     cin>>n;
//     int a[n];
//     for(int i=0;i<n;i++)
//        cin>>a[i];
//     for(int i=0;i<n-1;i++)
//     {
//         for(int j=i+1;j<n;j++)
//         {
//             if(a[i]==a[j])
//             {
//                 cout<<i+1;
//                  return 0;
//             }

//         }
//     }
//     return 0;
// }


//2nd method

#include "bits/stdc++.h"
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
        cin >> a[i];
    const int N = 1e6 + 2; // initializing N with 10^6+2
    int idx[N];

    for (int i = 0; i < N; i++)
    {
        idx[i] = -1;//filing the idx array with -1 value;
    }

    int minidx = INT_MAX;

    for (int i = 0; i < n; i++)
    {
        if (idx[a[i]] != -1)
            minidx = min(minidx, idx[a[i]]);
        else
            idx[a[i]] = i;
    }

    if (minidx == INT_MAX)
        cout << "-1" << endl;
    else
        cout <<( minidx+1) << endl;
    return 0;
}

//3rd method:hashing
