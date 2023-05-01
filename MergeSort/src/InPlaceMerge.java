public class InPlaceMerge {
    public static void main(String[] args){

    }
    static void merge(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
        int mid=(start+end)/2;
        merge(arr,start,mid);
        merge(arr,mid,end);
        mergeSort(arr,start,mid,end);


    }
    private static void mergeSort(int[] arr,int start,int mid,int end){

    }
}
