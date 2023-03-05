public class RotatedArray {
    public static void main(String[] args){


    }
    static int FindPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            //4cases to be checked
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid
            }
            if(mid<start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if()
        }
    }
}