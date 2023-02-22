public class SmallestLetter {
    public static void main(String[] args){
        char[] str={'r','a','n','j','a','n'};
        char key='j';
        char ans=Ceiling(str,key);
        System.out.println(ans);

    }
    public char nextGreatestLetter(char[] letters, char target) {
        static int Ceiling(char[] arr,char key){
            if(key>arr[arr.length-1]){
                return arr[0];

            }
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(key<arr[mid]){
                    end=mid-1;
                }
                else if (key>arr[mid]){
                    start=mid+1;

                }
                else if(key==arr[mid]) {
                    return arr[mid-1];
                }
            }
            return arr[start];
        }

    }

}
