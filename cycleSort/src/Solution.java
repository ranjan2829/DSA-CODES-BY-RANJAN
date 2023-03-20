class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {



        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);



            }
            else{
                i++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;


    }
    static void swap(int[] arr,int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
}