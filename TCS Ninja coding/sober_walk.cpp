/*
Our hoary culture had several great persons since time immemorial and king vikramaditya’s nava ratnas (nine gems) belongs to this ilk.
Among these, Varahamihira was an astrologer of eminence and his book Brihat Jataak is recokened as the ultimate authority in astrology. He was once talking with Amarasimha,another gem among the nava ratnas and the author of Sanskrit thesaurus, Amarakosha. Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels per following scheme.

He first turns and travels 10 units of distance
His second turn is upward for 20 units
Third turn is to the left for 30 units
Fourth turn is the downward for 40 units
Fifth turn is to the right(again) for 50 units
… And thus he travels, every time increasing the travel distance by 10 units.

Constraints:
2<=n<=1000

Input:    
3
Output:
-20 20
*/
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the number of steps: ";
    cin>>n;
    char c='R';
    int incr=10;
    int x=0,y=0;
    while(n)
    {
        switch(c)
        {
            case 'R':
               x+=incr;
               c='U';
               break;
            case 'U':
               y+=incr;
               c='L';
               break;
            case 'L':
               x-=incr;
               c='D';
               break;
            case 'D':
               y-=incr;
               c='R';
               break;
        }
        n--;  
        incr+=10; 
    }
    cout<<x<<" "<<y<<endl;
    return 0;
}