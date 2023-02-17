package Java_Algorithm;

import java.security.KeyStore;

public class Searchin2darray {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
                      {4,5,6},
                      {7,8,9}
        };
        int key =7;
        System.out.println(search2d(arr,key));

    }
    static int search2d(int[][] arr,int key){
        int index=0;
        for(int i=0 ;i<arr.length;i++){
            for(int x=0;x<arr[i].length;i++){
                if(arr[i][x]==key){
                    index=x;
                    return index;
                }
            }
        }
        return index;
    }
}
