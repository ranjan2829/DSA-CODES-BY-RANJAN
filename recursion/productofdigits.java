package recursion;

public class productofdigits {
    public static void main(String[] args){
        int ans =product(13455667);
        System.out.println(ans);

    }
    static int product(int n){
        if(n==0){
            return 0;
        }
        return (n%10)*product(n/10);
    }


}


