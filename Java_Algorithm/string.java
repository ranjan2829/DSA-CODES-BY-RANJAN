package Java_Algorithm;

public class string {
    public static void main(String[] args){
        String name="ranjan";
        char c = 'j';
        boolean ans = search(name,c);
        System.out.println(ans);
    }
    static boolean search(String naa,char t) {
        int i = 0;
        if(naa.length()==0){
            return false;

        }
        for (i = 0;i < naa.length();i++){
            if(t == naa.charAt(i)){
                return true;
            }

        }
        return false;






    }
}
