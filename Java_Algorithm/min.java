package Java_Algorithm;
public class min {
    public static void main(String[] args){
        int[] arr ={166,2,3,4,5,6,7,8,9,10};
        System.out.println(findmin(arr));
    }
    static int findmin(int[] arr){
        int key =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<key){
                key = arr[i];
            }
        }
        return key;
    }

}
