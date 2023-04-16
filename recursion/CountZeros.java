package recursion;

public class CountZeros {
    public static void main(String[] args){
        int num=01110030;
        count(num);
        System.out.println(count(num));


    }
    static int count(int n){
        return helper(n,0);


    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }

}
