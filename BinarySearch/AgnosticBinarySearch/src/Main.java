import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
        int key = 4;
        System.out.println(Agnostic(arr, key));

    }

    static int Agnostic(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;


        boolean isAsc = arr[low] < arr[high];
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (key == arr[mid]) {
                return mid;
            }
            if(isAsc){
                if(key<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;


                }

            }
            else{
                if(key>arr[mid]){
                    high=mid-1;

                }
                else {

                    high = mid - 1;
                }

            }


        }
        return -1;

    }
}
