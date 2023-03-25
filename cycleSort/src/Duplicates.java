package cycleSort.src;

import java.util.List;

public class Duplicates {
    public static void main(String[] args){

    }
    static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);

            }
            else {
                i++;
            }
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;


    }

}
