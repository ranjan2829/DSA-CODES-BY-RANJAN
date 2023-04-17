package recursion;

public class nto1 {
    public static void main (String[] args){
        int num=8;
        revseries(num);

    }
    static int series(int n){
        System.out.println(n);

        if(n==1){
            return n;
        }
        return series(n-1);



    }
    static void revseries(int n){


        if(n==0){
            return;
        }
        series(n-1);
        System.out.println(n);



    }
}
