import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args){
        //System.out.println(letter("","23"));
        combo("","23");


    }
    static void combo(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            combo(p+ch,up.substring(1));
        }
    }
    static List<String> letter(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left = (ArrayList<String>) letter(p + ch, up.substring(1));
        ArrayList<String> right = (ArrayList<String>) letter(p, up.substring(1));
        left.addAll(right);
        return left;

    }




}
