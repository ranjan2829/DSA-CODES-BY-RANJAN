public class InfinitePosition {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int key=7;
        System.out.println(ans(arr,key));

    }
    static int ans(int[] arr,int key){
        int start=0;
        int end=1;
        while(key>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;

        }
        return binearySearch(arr,key,start,end);

    }
    static int binearySearch(int[] arr,int key,int start,int end){


        while(start<=end){
            int mid=start+(end-start)/2;
            if (key>arr[mid]){
                start=mid+1;

            } else if (key<arr[mid]) {
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
