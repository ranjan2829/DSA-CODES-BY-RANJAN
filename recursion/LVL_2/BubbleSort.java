package recursion.LVL_2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }
//    static int BubbleSort(int[] arr,int i,int j){
//        if(arr.length==0){
//            return 0;
//        }
//        if(arr[i]>arr[j]){
//            swap(arr,i,j);
//        }
//        else{
//            BubbleSort(arr,i+1,j+i+1);
//        }
//        return -1;
//
//    }
//    static void swap(int[] arr,int a , int b){
//        int temp = arr[a];
//        arr[b]=arr[a];
//        arr[a]=temp;
//
//
//    }
    static void bubble(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=temp;
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,0);
        }
    }
}

