public class duplicate {




    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int[] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;






    }
}