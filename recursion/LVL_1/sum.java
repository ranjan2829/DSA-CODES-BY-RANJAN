package recursion;

public class sum {
    public static void main(String[] args){
        System.out.println(sumnum(8));


    }
    static int sumnum(int n){
        if(n==1){
            return 1;
        }

        return n+sumnum(n-1);



    }
}
