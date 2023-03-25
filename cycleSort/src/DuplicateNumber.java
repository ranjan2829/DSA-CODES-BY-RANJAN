package cycleSort.src;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args){
        int[] arr={1,3,2,4,2};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(cyclesort(arr));

    }
    static int cyclesort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){


                int correct = arr[i] - 1;
                if (arr[correct] != arr[i]) {
                    swap(arr, i, correct);

                }
                else {
                    return arr[i];
                }

            }
            else{
                i++;
            }



        }
        return -1;


    }
    static void swap(int[] arr, int first ,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
