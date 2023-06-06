#include<iostream>
#include<list>
using namespace std;

class linear_hashing{
    int hash[10]={0};
    int flag[10]={0};
public:
     void insert(int num){
        int loc = num%10;
        while(flag[loc]==1){
            loc=(loc+1)%10;
        }
        hash[loc]=num;
        flag[loc]=1;
     }
     void display(){
        for (int i=0;i<10;i++){
            cout<<" ( "<< i <<" )->  "<<endl;
            if(flag[i]==1){
                cout<<hash[i]<<"\n";

            }
            else{
                cout<<"-------\n";
            }
        }
     }


};
class chaining{
    list<int> table[10];
    public:
    void insert(int num){
        table[num%10].push_back(num);


    }
    void display(int key) {
        cout << "Chain " << key << ": ";
        for (int value : table[key]) {
            cout << value << " ";
        }
        cout << endl;
    }

};
int main() {
    int ch;
    int num;
    int nu1;
    while (true) {
        cout << "Choose a technique:\n1. Linear Probing\n2. Chaining\n";
        cout << "Enter your choice: ";
        cin >> ch;

        switch (ch) {
            case 1: {
                LinearProbing linearProbing;
                cout<<"enter num";
                cin>>num;
                for(int i=1;i<=num;i++){
                    cout<<"enter numn";
                    cin>>nu1;
                    linearProbing.insert(nu1);
                }
                linearProbing.insert(34);
                linearProbing.insert(23);
                linearProbing.display();
                break;
            }
            case 2: {
                Chaining chaining;
                cout<<"enter num";
                cin>>num;
                
                for(int i=1;i<=num;i++){
                    cout<<"enter total nums";
                    cin>>nu1;
                    chaining.insert(nu1);
                    
              
                }
                for(int i=1;i<=num;i++){
                    chaining.display(i);
                    
                }
                
               
                
                break;
            }
            default:
                cout << "Invalid choice. Please try again.\n";
        }
    }

    return 0;
}
