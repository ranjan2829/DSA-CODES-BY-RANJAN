package recursion.LVL_2;

import java.util.ArrayList;

public class LinearSearchMultiple {
    public static void main(String[] args){

        int[] arr={2,3,4,5,6,7,8,9,1};
        int target=1;

        System.out.println(search(arr,0,target));


        }
        static ArrayList<Integer> list = new ArrayList<>();

        static boolean search(int[] arr,int c,int target){
            if(c==arr.length){
                return false;
            }
            if(arr[c]==target){
                list.add(c);
            }



                return arr[c] == target || search(arr, c + 1, target);



        }


}








