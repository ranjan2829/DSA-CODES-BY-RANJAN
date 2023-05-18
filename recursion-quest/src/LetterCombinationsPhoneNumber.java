import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args){
        combo("","abc");


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
    static List<String> letter(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = letter(p+ch,up.substring(1));
        ArrayList<String> right = letter(p,up.substring(1));
        left.addAll(right);
        return left;

    }




}
