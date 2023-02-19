public class Main{
    public static void main(String[] args){
        int[] arr ={-1,1,2,3,4,5,6,7,8,9,10};
        int key=-1;
        System.out.println(BinarySearch(arr,key)); 


    }
    static int BinarySearch(int[] arr,int key){
        int low=arr[0];

        int high =arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if (key<arr[mid]){
                high=mid-1;
            }
            else if (key>arr[mid])
            {
                low=mid+1;

            }
            else if(key==arr[mid])
            {
                return mid;
            }
        }
        return -1;

    }
}