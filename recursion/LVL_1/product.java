package recursion;

public class product {
    public static void main(String[] args){
        System.out.println(product(8));


    }
    static int product(int n){
        if(n==1){
            return 1;
        }

        return n*product(n-1);



    }

}
