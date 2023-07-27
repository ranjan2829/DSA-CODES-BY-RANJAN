public class Smallestwindow {
    public static void main(String[] args) {

    }
    static String smallest(String s,String p){
        int x= s.length();
        int y=p.length();
        if(y>x){
            return "-1";

        }
        StringBuilder str= new StringBuilder();
        int max=Integer.MAX_VALUE;
        int[] freq=new int[26];
        for(int i=0;i<y;i++){
            freq[p.charAt(i)-'a']++;
        }
    }

}

