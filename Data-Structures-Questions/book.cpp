#include <iostream>
#include <string>
using namespace std;

struct Node {
    string label;
    int count;
    Node* children[50];
};

void insertNode(Node* node) {
    cout << "Enter the name: ";
    getline(cin >> ws, node->label);

    cout << "Enter the number of children: ";
    cin >> node->count;

    for (int i = 0; i < node->count; i++) {
        node->children[i] = new Node();
        insertNode(node->children[i]);
    }
}

void displayNode(Node* node, string indent = "") {
    if (node != nullptr) {
        cout << indent << node->label << endl;
        indent += "   ";
        for (int i = 0; i < node->count; i++) {
            displayNode(node->children[i], indent);
        }
    }
}

int main() {
    Node* root = new Node();
    cout << "Enter the name of the book: ";
    getline(cin >> ws, root->label);

    cout << "Enter the number of chapters: ";
    cin >> root->count;

    for (int i = 0; i < root->count; i++) {
        root->children[i] = new Node();
        cout << "Enter the name of chapter " << i + 1 << ": ";
        getline(cin >> ws, root->children[i]->label);

        cout << "Enter the number of sections: ";
        cin >> root->children[i]->count;

        for (int j = 0; j < root->children[i]->count; j++) {
            root->children[i]->children[j] = new Node();
            cout << "Enter the name of section " << i + 1 << '.' << j + 1 << ": ";
            getline(cin >> ws, root->children[i]->children[j]->label);

            cout << "Enter the number of subsections: ";
            cin >> root->children[i]->children[j]->count;
        }
    }

    cout << "\n--------------- Hierarchy of Book ---------------\n";
    displayNode(root);

    return 0;
}