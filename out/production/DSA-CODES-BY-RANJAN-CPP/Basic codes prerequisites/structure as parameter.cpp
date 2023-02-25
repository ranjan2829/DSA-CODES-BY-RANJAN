#include <iostream>
using namespace std;


struct rect{
    int length;
    int breadth;

};


int area(struct rect r1)
 {
    r1.length++;

    return r1.length*r1.breadth;

}
int main(){





    struct rect r ={10,5};
    cout<<"area"<<area(r);
}