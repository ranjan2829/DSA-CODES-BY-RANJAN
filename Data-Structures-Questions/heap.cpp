#include<iostream>
#include<algorithm>
using namespace std;

class heap{
    int* Hp;
    int size;
public:
    heap(n){
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
        make_heap(Hp,size);
        return heap[0];
    }
    int maxmarks(){
        make_heap(Hp,size,greater <int>())
        return heap[0];
    }
    ~heap{
        delete[] Hp;
    }
    
};
