public class Main {
    public static void main(String[] args) {
        int[] arr ={2,3,5,4,19};
        int a =10;
        String name ="ranjan shitole";
        System.out.println(name);
        String name1=new String("ranjan");
        String name2= new String("ranjan");
        System.out.println(name1==name2);
        //only value
        System.out.println(name1.equals(name2));
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}