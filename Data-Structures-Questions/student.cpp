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
