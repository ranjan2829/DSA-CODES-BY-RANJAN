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
