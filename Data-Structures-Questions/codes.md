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
        for(int j=0;j<root->children[i]->count;j++){
            root->children[i]->children[j]=new Node;
            cout<<"enter sec name"<<endl;
            cin>>root->children[i]->children[j]->label;
            cout<<"enter number of sub sections"<<endl;
            cin>>root->children[i]->children[j]->count;


        }
        cout<<"**********book*********"<<endl;
        display(root);
        return 0;
        

    }
}

















#include<iostream>
#include<fstream>
using namespace std;
class record{
    int id;
    string name;
    int salary;
    string designation;
    public:
    void data();
    void put();
};
void record::data(){
    cout << "\nEnter Details:\n";
    cout << "Id no: ";
    cin >> id;
    cout << "Name: ";
    cin >> name;
    cout << "Salary: ";
    cin >> salary;
    cout << "Designation: ";
    cin >> designation;
  
}
void record::put(){
    cout << "\nId No.: " << id;
    cout << "\tName: " << name;
    cout << "\nSalary: " << salary;
    cout << "\tDesignation: " << designation;
}
class File{
    fstream fs;
    public:
    void insert();
    void display();

};
void File::insert(){
    record r;
    fs.open("employeeDB");
    while(fs.read((char*)&r,sizeof(r))){
        r.put();
    }
    fs.close();


}
int main(){
    File f;
    int ch;
    do{
        cout << "\n\n\t-----M E N U-----";
        cout << "\n1. Build A Master Table";
        cout << "\n2. List A Table";
        cout << "\n3. Insert a New Entry";
        cout << "\n4. Quit";
        cout << "\nEnter your Choice: ";
        cin>>ch;
        switch (ch)
        {
        case 1:
            /* code */
            int n;
            cout<<"enter number of records"<<endl;
            cin>>n;
            for(int i=0;i<n;i++){
                f.insert();
            }
            break;

        case 2:
             f.display();
             break;
        case 3: 
            f.insert();
        case 4: 
            break;



        
        default:
            cout<<"enter choice"<<endl;

        }

    }while(ch!=4);
    return 0;
    
}













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
#include<iostream>
#include<algorithm>
using namespace std;

class heap{
    int* Hp;
    int size;
public:
    heap(int n){
        size=n;
        Hp = new int[size];
    }
    void get_marks(){
        for(int i=0;i<size;i++){
            cout<<"enter marks of  "<<i<<"  student"<<endl;
            cin>>Hp[i];

        }
    }
    int minmark(){
        make_heap(Hp,Hp+size);
        return Hp[0];
    }
    int maxmarks(){
        make_heap(Hp,Hp+size,greater<int>());
        return Hp[0];
    }
    ~heap(){
        delete[] Hp;
    }
    
};
int main(){
    int n;
    cout<<"enter the n"<<endl;
    cin>>n;
    heap h(n);
    h.get_marks();

    cout<<"max"<<h.maxmarks();
    cout<<"min"<<h.minmark();
    h.~heap();
    return 0;


}



+
#include <iostream>
#include <vector>
#include <limits>

using namespace std;

class Office {
    int n;
    vector<string> office;
    vector<vector<int>> adjacent;

public:
    void input() {
        cout << "Enter no. of offices: ";
        cin >> n;

        office.resize(n);
        cout << "Enter the names of offices: ";
        for (int i = 0; i < n; i++)
            cin >> office[i];

        adjacent.resize(n, vector<int>(n));
        cout << "Enter the cost to connect the offices:\n";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                cout << "Enter the cost to connect " << office[i] << " and " << office[j] << ": ";
                cin >> adjacent[i][j];
                adjacent[j][i] = adjacent[i][j];
            }
        }
    }

    void Prims() {
        vector<int> visit(n, 0);
        int minCost, count = n - 1, minIndex, cost = 0;

        cout << "Shortest path: ";
        visit[0] = 1;
        cout << office[0] << " -> ";

        while (count--) {
            minCost = numeric_limits<int>::max();
            for (int i = 0; i < n; i++) {
                if (visit[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visit[j] && adjacent[i][j] != 0 && adjacent[i][j] < minCost) {
                            minCost = adjacent[i][j];
                            minIndex = j;
                        }
                    }
                }
            }
            visit[minIndex] = 1;
            cout << office[minIndex] << " -> ";
            cost += minCost;
        }
        cout << "End\n";
        cout << "Minimum cost: " << cost << endl;
    }
};

int main() {
    Office o1;
    o1.input();
    o1.Prims();
    return 0;
}
#include <iostream>
#include <fstream>
using namespace std;

struct Record {
    int rollno;
    string name;
    int division;
    string address;
};

void insertRecord() {
    Record r;
    cout << "\nEnter Details:\n";
    cout << "Roll no: ";
    cin >> r.rollno;
    cout << "Name: ";
    cin >> r.name;
    cout << "Division Code: ";
    cin >> r.division;
    cout << "Address: ";
    cin >> r.address;

    ofstream fout("StudentDB", ios::app | ios::binary);
    fout.write(reinterpret_cast<char*>(&r), sizeof(r));
    fout.close();
}

void displayRecords() {
    ifstream fin("StudentDB", ios::binary);
    Record r;
    while (fin.read(reinterpret_cast<char*>(&r), sizeof(r))) {
        cout << "\nRoll No.: " << r.rollno;
        cout << "\tName: " << r.name;
        cout << "\nDivision Code: " << r.division;
        cout << "\tAddress: " << r.address;
    }
    fin.close();
}

int main() {
    int choice;
    do {
        cout << "\n\n-----M E N U-----";
        cout << "\n1. Insert a New Record";
        cout << "\n2. Display All Records";
        cout << "\n3. Quit";
        cout << "\nEnter your Choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                insertRecord();
                break;
            case 2:
                displayRecords();
                break;
            case 3:
                break;
            default:
                cout << "\nEnter a valid choice.";
                break;
        }
    } while (choice != 3);

    return 0;
}
