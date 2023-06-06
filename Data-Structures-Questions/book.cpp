#include<iostream>

#include<string>
using namespace std;

struct Node{
    string label;
    int count;
    Node* children[50];
};
void insert(Node* node){
    int n;
    cout<<"enter the number of nodes "<<endl;
    cin>>n;
}