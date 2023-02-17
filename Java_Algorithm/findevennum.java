package Java_Algorithm;

public class findevennum {
    public static void main(String[] args){
        int[] arr ={1,2,33,44,55,2,5,5,44,55,3,5,3};
        int ans =search(arr);
        System.out.println(ans);

    }
    static int search(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int index=0;

        int counter=0;
        for(int i=0;i<arr.length;i++){
            String element= Integer.toString(arr[i]);
            int size=element.length();
            if(size%2==0){
                counter++;

            }

        }
        return counter;


    }
}
