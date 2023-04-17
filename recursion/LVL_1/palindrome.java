package recursion;

public class palindrome {
    public static void main(String[] args){
        check(12345);




    }
    static int sum=0;
    static int reverse(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    static int check(int n){
        int ans= reverse(n);
        if(ans==n){
            return 1;
        }
        else{
            return 0;
        }

    }

}
