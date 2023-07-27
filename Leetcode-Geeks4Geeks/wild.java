class Solution {
    static boolean match(String wild, String pattern) {
        return isMatch(wild, pattern, 0, 0);
    }

    private static boolean isMatch(String wild, String pattern, int wildIdx, int patternIdx) {
        // Base cases
        if (wildIdx == wild.length() && patternIdx == pattern.length()) {
            return true; // Both strings are exhausted
        }
        if (wildIdx == wild.length() || patternIdx == pattern.length()) {
            return false; // Either one of the strings is exhausted
        }

        char wildChar = wild.charAt(wildIdx);
        char patternChar = pattern.charAt(patternIdx);

        if (patternChar == '?' || wildChar == patternChar) {
            // Characters match, move to the next characters in both strings
            return isMatch(wild, pattern, wildIdx + 1, patternIdx + 1);
        } else if (patternChar == '*') {
            // Two options: either consider '*' as an empty sequence or multiple characters
            return isMatch(wild, pattern, wildIdx + 1, patternIdx) || isMatch(wild, pattern, wildIdx, patternIdx + 1);
        }

        return false; // Characters don't match and patternChar is not '?'
    }
}
