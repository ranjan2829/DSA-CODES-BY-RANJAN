package recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberSteps {
    public static void main(String[] args){
        System.out.println(steps(14));

    }
    static int counter =0;
    private static int steps(int n){
        if(n%2!=0){
            steps(n-1);
        }
        int ans=n/2;
        counter=counter+1;
        steps(ans);
        return counter;
    }
}
