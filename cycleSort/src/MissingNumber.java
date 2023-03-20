package cycleSort.src;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,4,3,2,1};
        cyclesort(arr);
        System.out.println("the missing number is "+check(arr));
        System.out.println(Arrays.toString(arr));


    }
    static void cyclesort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct );
            }
            else {
                i++;
            }




        }
    }
    static void swap(int[] arr,int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;

    }
    static int check(int[] arr){
        int i=0;
        while(i<arr.length){

            if(arr[i]!=i){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}




