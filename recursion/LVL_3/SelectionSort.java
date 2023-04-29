import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr= {8,6,5,4,3,2,1};
        SelectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionSort(int[] arr,int r,int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                SelectionSort(arr,r,c+1,c);
            }
            else{
                SelectionSort(arr,r,c+1,max);
            }
        }
        //tricky Question
        else{
            int temp =arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            SelectionSort(arr,r-1,0,0);
        }
    }
}
