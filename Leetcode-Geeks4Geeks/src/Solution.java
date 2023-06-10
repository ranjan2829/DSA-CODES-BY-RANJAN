import java.util.Arrays;
public class Solution
{


    public static void main(String[] args ){
        int[] A={4,5,6,7,8,9,1};
        int N=A.length;
        System.out.println(findSum(A,N));

    }
    public static int findSum(int A[],int N)
    {
        int x=0,y=0;

        for(int i=0;i<N-1;i++){
            if(A[i]<A[i+1]){
                x=A[i+1];
            }
            else {
                y=A[i];
            }

        }
        int u=x+y;
        System.out.println(x);
        System.out.println(y);
        return u;


        
        
    }
}