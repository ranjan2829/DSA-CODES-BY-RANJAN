public class RotatedArray{
    public static void main(String[] args){
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

    }
    static int search(int[] arr,int target){
        int num=findPivot(arr);
        if(num==-1) {
            return binarySearch(arr, target, 0, arr.length - 1)
        }


        if(target==arr[num]){
            return pivot;
        }
        if(target>=arr[pivot])


    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;


            //4cases

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]>arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return -1;
    }
}
