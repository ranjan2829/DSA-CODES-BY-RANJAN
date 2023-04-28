package recursion.LVL_2;

public class Triangle {
    public static void main(String[] args){
        int ans= 5;
        System.out.println(Pattern(ans));

    }
    static int Pattern(int i){
        if(i==0){
            return 1;
        }
        char c= '*';
        System.out.println(c*i);
        Pattern(i-1);
        return 0;

    }
}
