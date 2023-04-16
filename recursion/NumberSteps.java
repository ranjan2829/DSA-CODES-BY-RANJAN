package recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberSteps {
    public static void main(String[] args) {
        //System.out.println(NumSteps);

    }
     public static int Numsteps(int n){
        return helper(n,0);
    }
    public int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);
    }




}

