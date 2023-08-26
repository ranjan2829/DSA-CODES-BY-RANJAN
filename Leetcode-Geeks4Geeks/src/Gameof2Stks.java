package src;

import java.util.Arrays;
import java.util.Scanner;

public class Gameof2Stks {
    static int TwoStk(int x.int[] a, int[] b){

    }
    private static int Twostk(int x,int[] a,int[] b,int sum ,int count) {
        if (sum > x) {
            return count;

        }
        if(a.length==0 ||b.length==0){
            return count;
        }
        int ans1 = Twostk(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = Twostk(x, a, Arrays.copyOfRange(b, 1, a=b.length), sum + a[0], count + 1);
        return Math.max(ans1,ans2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m= sc.nextInt();
            int x =sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
            for(int j=0;j<m;j++){
                b[i]= sc.nextInt();
            }
            System.out.println(TwoStk(x,a,b));

        }
    }
}
