import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr ={8,7,6,5,4,3,2,1};
        quicksort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));









    }
    static void quicksort(int[] arr,int high, int low){
        if(low>=high){
            return;

        }
        int s =low;
        int e=high;
        int mid =s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;

            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp =arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

    }


}