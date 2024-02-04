class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char right = Character.toLowerCase(s.charAt(start));
            char left = Character.toLowerCase(s.charAt(end));
            if (!isAlphaNumeric(right)) {
                start++;
                continue;
            }
            if (!isAlphaNumeric(left)) {
                end--;
                continue;
            }
            if (right != left) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return ((c <= 'z' && c >= 'a') || (c >= '0' && c <= '9'));
    }

}