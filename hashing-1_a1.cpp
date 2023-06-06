#include <iostream>
#include <list>
using namespace std;

class LinearProbing {
    int hash[10] = {0};
    int flag[10] = {0};

public:
    void insert(int x) {
        int loc = x % 10;
        while (flag[loc] == 1) {
            loc = (loc + 1) % 10;
        }
        hash[loc] = x;
        flag[loc] = 1;
    }

    void display() {
        cout << "Hash Table (Linear Probing):" << endl;
        for (int i = 0; i < 10; i++) {
            cout << "(" << i << ") -> ";
            if (flag[i] == 1) {
                cout << hash[i] << "\n";
            } else {
                cout << "----\n";
            }
        }
    }
};

class Chaining {
    list<int> table[10];

public:
    void insert(int key) {
        table[key % 10].push_back(key);
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
