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
        int[] freqS = new int[26];
        int l = 0, r = 0;
        while(r<x){
            freqS[s.charAt(r)-'a']++;
            while(l<=r && isValid(freqS,freq)==0){
                if(max>r-l+1){
                    max=r-l+1;
                    str=new StringBuilder(s.substring(l,r+1));
                }
                freqS[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }if(max==Integer.MAX_VALUE){
            str.append("-1");

        }
        return str.toString();
    }

}

