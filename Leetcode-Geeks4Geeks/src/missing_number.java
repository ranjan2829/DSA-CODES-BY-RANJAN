import java.util.Arrays;
public class missing_number {
    public static void main(String[] args){
        int[] array={9,8,7,6,4,3,2,1,0};
        int n= array.length;
        System.out.println(missing(array,n));

    }




    public static int missing(int[] arr,int n){
        int i=0;
        int x=0;


        while(i<arr.length);
            if(arr[i]==i){
                i++;
            }
            else {
                x=i;
            }
        }
        return x;

    }


}

        // Your Code Here
