import java.util.Arrays;

public class Main {
    private static int max;

    public static void main(String[] args) {
        int[] arr={8,7,6,5,4,3,2,1,0};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void SelectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max = getMax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMax(int[] arr,int start,int end){
        int max=start;
        for (int i= 0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int tem=arr[first];
        arr[first]=arr[second];
        arr[second]=tem;
    }

}