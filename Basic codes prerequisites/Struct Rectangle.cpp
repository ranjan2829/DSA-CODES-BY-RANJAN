#include<iostream>
#include<stdio.h>
using namespace std;

struct Rectangle 
{
    int leangth;
    int breadth;

}
int main(){
    struct Rectangle r ={10,5};
    r.length=15;
    r.breadth=9;
    cout<<r.length<<endl;
    cout<<r.breadth<<endl;

    return 0;

}
