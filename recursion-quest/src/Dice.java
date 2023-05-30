public class Dice {
    public static void main(String[] args){
        Sub("",4);

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

}

