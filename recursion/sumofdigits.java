package recursion;

public class sumofdigits {
    public static void main(String[] args){
        System.out.println(sum(999));

    }
    static int sum(int n){
        String num=Integer.toString(n);
        int length=num.length();
        int ans=0;
        for(int i=0;i<length;i++){
            ans+=num.charAt(i);

        }
        return ans;

    }

}
