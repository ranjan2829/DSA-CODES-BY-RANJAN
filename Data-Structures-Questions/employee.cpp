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
