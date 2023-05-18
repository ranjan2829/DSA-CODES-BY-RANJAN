import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args){
        combo("","abc");
        Subsequence("","abc");

    }
    static void combo(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        combo(p + ch, up.substring(1));
        combo(p, up.substring(1));
    }


}
