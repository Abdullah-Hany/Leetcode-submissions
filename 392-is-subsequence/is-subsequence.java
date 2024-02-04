class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointer = 0;
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            while (pointer < t.length() && t.charAt(pointer) != sChar) {
                pointer++;
            }
            if (pointer == t.length()) {
                return false;
            }
            if (sChar == t.charAt(pointer)) {
                pointer++;

            } else {
                return false;
            }
        }

        return true;
    }
}