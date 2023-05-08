public class Main {
    public static void main(String[] args) {









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
        quicksort(arr,low,e);
        quicksort(arr,s,high);
    }


}