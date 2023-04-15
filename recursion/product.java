package recursion;

public class product {
    public static void main(String[] args){
        product(8);


    }
    static void product(int n){
        if(n==1){
            return;
        }
        System.out.println(n*n-1);
        product(n-1);

    }

}
