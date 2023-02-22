public class FloorNumber {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int key=5;
        int ans=FloorNumber(arr,key);
        System.out.println(ans);

    }
    static int FloorNumber(int[] arr,int key){
        if (key > arr[arr.length-1]){
            return -1;

        }
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (key<arr[mid]){
                end=mid-1;

            }
            else if (key>arr[mid]){
                start=mid+1;


            }
            else {
                return mid;

            }
        }
        return arr[end];


    }
}
