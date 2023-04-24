package recursion.LVL_2;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,7,8,8,8,9,10};

        System.out.println(Findall(arr,8,0, ArrayList<Integer> list);

    }
    static ArrayList<Integer> Findall(int[] arr,int target,int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return Findall(arr, target, index + 1, list);

    }
}
