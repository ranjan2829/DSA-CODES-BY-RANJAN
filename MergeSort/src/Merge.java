import java.util.Arrays;

public class Merge {

    public static void main(String[] args){

    }
    static int[] MergeSort(int[] arr) {


        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }
    private static int[] merge(int[] first,int[] second){

    }







}
