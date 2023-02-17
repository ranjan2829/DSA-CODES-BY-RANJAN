public class Main {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int key =7;
        int ans=linear(arr,key);
        System.out.println(ans);

    }
    static int linear(int[] arr,int key){
        if(arr.length==0){
            return -1;
        }
        for ( int i =0;i<arr.length;i++){
            int ele=arr[i];
            if(ele==key){
                return i;
            }
        }
        return 0;
    }


    }

}