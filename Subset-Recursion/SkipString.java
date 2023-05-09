public class SkipString {
    public static void main(String[] args){
        Skip("yo apple juice yo");


    }
    static void Skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return Skip(up.substring(5));
        }
        else{
            return up.charAt(0)+Skip(up.substring(1));
        }
    }
}
