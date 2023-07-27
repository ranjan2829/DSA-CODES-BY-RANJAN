public class palindromicstring {
    public static void main(String[] args) {

    }
    static int count(String s){
        int c=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            ans="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                ans+=ch;
                boolean bool=isPlain(ans);
                if(bool==true){
                    c+=1;
                }
            }
        }
        return c;
    }
    static boolean isPlain(String str){
        int i=0;

    }
}
