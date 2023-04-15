package recursion;

public class product {
    public static void main(String[] args){
        product(8);


    }
    static void product(int n){
        if(n==1){
            return;
        }
        int ans = 1;
        ans=ans*(n*(n-1));


        System.out.println(ans);
        product(n-1);



    }

}
