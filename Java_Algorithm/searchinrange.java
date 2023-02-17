package Java_Algorithm;

public class searchinrange {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int key = 3;
        int ans = range(arr,key);
        System.out.println(ans);


    }
    static int range(int[] arr,int key){
        if (arr.length==0){
            return 0;
        }
        for(int i = arr[1];i<arr[4];i++){
            if(key==arr[i]){
                return 0;
            }
        }
        return 0;
    }
}
