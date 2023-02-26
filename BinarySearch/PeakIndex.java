public class PeakIndex {
    public static void main(String[] args){
        int[] arr={1,2,3,7,4,3,2,1,0,-1,-2};
        int ans=BinarySearchForPeakIndexInMountain(arr);
        System.out.println(ans);

    }
    static int BinarySearchForPeakIndexInMountain(int[] arr){
        int start=0;
        int end= arr.length-1;
        if(arr.length==0){
            return -1;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;


            }
            else{
                start=mid+1;
            }

        }
        return arr[start];

    }
}
