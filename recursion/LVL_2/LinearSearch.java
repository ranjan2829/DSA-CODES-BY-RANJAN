package recursion.LVL_2;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8,9};
        int target=1;
        System.out.println(search(arr,0,target));

    }
    static boolean search(int[] arr,int c,int target){
        if(arr[c]==target){
            return true;
        }

        return arr[c]!=target || search(arr,c+1,target);


    }

}
