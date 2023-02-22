public class CeilingNumber {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int target=15;
        int ans=Ceiling(arr,target);
        System.out.println(ans);

    }
    static int Ceiling(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start + (end - start) / 2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if (target>arr[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }

        }
        return start;

    }
}