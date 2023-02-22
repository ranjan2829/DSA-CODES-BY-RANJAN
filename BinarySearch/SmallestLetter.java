public class SmallestLetter {
    public static void main(String[] args){
        char[] letters={'r','a','n','j','a','n'};
        char key='j';
        int ans=Ceiling(letters,key);
        System.out.println(ans);

    }
    public char Ceiling(char[] letters, char target) {


            int start=0;
            int end=letters.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<letters[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;

                }

            }
            return letters[start%letters.length];
    }

}


