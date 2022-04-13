/*
Sweet Seventeen Problem Statement
Given a maximum of four digit to the base 17 (10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value.

Test Cases
Case 1
Input – 1A
Expected Output – 27
Case 2
Input – 23GF
Expected Output – 10980
*/
#include<iostream>
#include <string.h>
#include <math.h>
using namespace std;
int main()
{
    char hex[17];
    int decimal=0;
    int digit=0;
    cout<<"Enter the number: ";
    cin>>hex;
    int i=0,len,val;
    len=strlen(hex);
    len--;
    for(i=0;hex[i]!='\0';i++)
    {
        if(hex[i]>='0' && hex[i]<='9')
              val=hex[i]-48;
        else if(hex[i]>='a'  &&  hex[i]<='g')
              val=hex[i]-97+10;
        else if(hex[i]>='A'  &&  hex[i]<='G')
              val=hex[i]-65+10;
        decimal=decimal+val*pow(17,len);
        len--;
    }
    cout<<decimal;

    return 0;
}