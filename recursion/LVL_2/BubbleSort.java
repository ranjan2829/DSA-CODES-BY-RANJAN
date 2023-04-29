package recursion.LVL_2;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={8,7,6,5,4,3,2,1};
        System.out.println(BubbleSort(arr,0,1));

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
//    }
}
