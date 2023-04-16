package recursion;

public class palindrome {
    public static void main(String[] args){



    }
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    static int check(int n){
        int ans= reverse(12345);
        if(ans==n){
            return 1;
        }
        else{
            return 0;
        }
        return -1;
    }

}
