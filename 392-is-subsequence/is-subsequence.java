class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int pointer = 0;
        for (int i = 0; i < t.length(); i++) {
            if (pointer < s.length() && s.charAt(pointer) == t.charAt(i)) {
                pointer++;
            }
        }

        return pointer == s.length();
    }
}