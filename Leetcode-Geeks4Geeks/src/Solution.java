import java.lang.reflect.Array;
import java.util.Arrays;
public class Solution
{


    public static void main(String[] args ){
        int[] A={44,15,76,87,8,19,1};
        int N=A.length;


        System.out.println(findSum(A,N));

    }
    public static int findSum(int A[],int N)
    {
        Arrays.sort(A);

        //for(int i=0;i<A.length;i++){
          //  for(int j=1;j< A.length;j++){
           //     if(A[j]<A[j-1]){
            //        int temp=A[j];
             //       A[j]=A[j-1];
                   // A[j-1]=temp;
             //   }
          //  }
        //}
        int min=A[0];
        int max=A[A.length-1];
        int sum=min+max;
        return sum;


    }
}