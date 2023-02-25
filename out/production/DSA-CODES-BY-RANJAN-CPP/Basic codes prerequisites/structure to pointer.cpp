#include<iostream>
#include<stdio.h>
using namespace std;
struct Rectangle{
    int length;
    int bed;

};
int main()
{
    struct Rectangle r ={10,5};
    struct Rectangle *p=&r;
    (*p).length=18;
    p->length=18;
    cout<<(*p).length<<endl;
    return 0;
    
}