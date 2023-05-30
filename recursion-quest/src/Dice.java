import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dice {
    public static void main(String[] args){
        Sub("",4);
        System.out.println(Subarray("",4));


    }
    static void Sub(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            Sub(p+i,target-i);

        }
    }
    static ArrayList<String> Subarray(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(Subarray(p+i,target-i));


        }return list;
    }

}

