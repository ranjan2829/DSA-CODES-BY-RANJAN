import java.util.Arrays;
public class missing_number {
    public static void main(String[] args){
        int[] array={9,7,6,4,3,2,1,0};
        int n= array.length;
        System.out.println(missing(array,n));

    }




    public static int missing(int[] arr,int n){
        Arrays.sort(arr);

        int x=0;


        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                x=i+1;
            }
            else {
                continue;
            }
        }
        return x;

    }


}

// Your Code Here
