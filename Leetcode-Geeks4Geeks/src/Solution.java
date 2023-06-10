import java.lang.reflect.Array;
import java.util.Arrays;
public class Solution
{


    public static void main(String[] args ){
        int[] A={4,5,6,7,8,9,1};
        int N=A.length;
        findSum(A,N);
        System.out.println(Arrays.toString(A));

    }
    static void findSum(int A[],int N)
    {
        for(int i=0;i<A.length;i++){
            for(int j=1;j< A.length-1;j++){
                if(A[j]<A[j-1]){
                    int temp=A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp;
                }
            }
        }




        
        
    }
}