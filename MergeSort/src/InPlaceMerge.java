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
        int[] mix =new int[end-start];
        int i=start;
        int j= mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
        }k++;
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[start+1]=mix[l];

        }


    }
}
