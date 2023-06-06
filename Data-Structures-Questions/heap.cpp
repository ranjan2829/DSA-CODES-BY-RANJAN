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
