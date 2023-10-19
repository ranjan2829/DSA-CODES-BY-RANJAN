
class Pair {
    String first;
    int second;

    Pair(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}

class Solution {
    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord, 1));
        Set<String> st = new HashSet<>();
        int len = wordList.length;
        for (int i = 0; i < len; i++) {
            st.add(wordList[i]);
        }
        st.remove(startWord);

        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if (word.equals(targetWord)) {
                return steps;
            }

            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replaced = word.toCharArray();
                    replaced[i] = ch;
                    String repWord = new String(replaced);

                    if (st.contains(repWord)) {
                        st.remove(repWord);
                        q.add(new Pair(repWord, steps + 1));
                    }
                }
            }
        }
        return 0;
    }
}
