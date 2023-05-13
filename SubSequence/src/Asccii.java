public class Asccii {
    public static void main(String[] args){
        Aci("","abc");


    }
    static void Aci(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch=up.charAt(0);
        Aci(p+ch,up.substring(1));
        Aci(p,up.substring(1));
        Aci(p+(ch+0),up.substring(1));


    }
}
