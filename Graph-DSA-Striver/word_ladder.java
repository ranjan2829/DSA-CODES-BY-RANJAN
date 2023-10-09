import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

class pair{
    String first;
    int second;
    pair(String _first, int _second){
        this.first=_first;
        this.second=_second;

    }
}
class Solution
{
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(startWord,1));
        Set<String> st=new HashSet<string>();
        int len=wprdList.length;
        for(int i=0;i<len;i++){
            st.add(wordList[i]);
        }
        st.remove(startWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(word.equals(targetWord)==true){
                return steps;
            }
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    
                }
            }
        }
        
    }
}