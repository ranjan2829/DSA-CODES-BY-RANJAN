import java.util.*;

public class GAnagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String words:strs){
            char[] chars=words.toCharArray();
            Arrays.sort(chars);

            String sorted=new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(words);

        }
        return new ArrayList<>(map.values());
    }

}
