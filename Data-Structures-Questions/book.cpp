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
    cout<<"enter name"<<endl;
    getline(cin>>ws,node->label);
    cout<<"enter the number of nodes "<<endl;
    cin>>node->count;
    for(int i=0;i<node->count;i++){
        node->children[i]=new Node;
        insert(node->children[i]);


    }
}
void display(Node* node,string indent =" "){
    if(node!=nullptr){
        cout<<indent<<node->label<<endl;
        indent+="  ";

    }
    for(int i=0;i<node->count;i++){
        display(node->children[i],indent);

    }

}
int main(){
    Node* root=new Node;
    cout<<"enter book name";
    cin>>root->label;
    cout<<"enter count"<<endl;
    cin>>root->count;
    for(int i=0;i<root->count;i++){
        root->children[i]=new Node;
        cout<<"enter name of chapter"<<endl;
        cin>>root->children[i]->label;
        cout<<"enter sections"<<endl;
        cin>>root->children[i]->count;
        for(int i=0;i<root->children[i]->count;i++){
            
        }

    }
}