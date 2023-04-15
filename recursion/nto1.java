package recursion;

public class nto1 {
    public static void main (String[] args){
        int num=8;
        System.out.println(series(num));

    }
    static int series(int n){
        System.out.println(n);

        if(n==1){
            return n;
        }
        return series(n-1);



    }
}
