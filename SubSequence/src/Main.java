import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Subsequence("","abc");
        System.out.println(Sub("","abc"));




    }
    static void Subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subsequence(p+ch,up.substring(1));
        Subsequence(p,up.substring(1));

    }
    static ArrayList<String> Sub(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= Sub(p+ch,up.substring(1));
        ArrayList<String> right =Sub(p,up.substring(1));
        left.addAll(right);
        return left;

    }
}