import java.util.ArrayList;
import java.util.Arrays;

public class stock {
    public static void main(String[] args){
        int[] arr = {100,180,260,310,40,535,695};

        System.out.println(stockBuySell(arr,7));




    }
    static ArrayList<Integer> stockBuySell(int[] arr, int n) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> main=new ArrayList<>();
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                list.add(i);
                list.add(i+1);


            }
            main.addAll(list);
        }
        return main;
    }
}
