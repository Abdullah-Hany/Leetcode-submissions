class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i))) {
                newString.append(s.charAt(i));
            }
        }
        return newString.toString().equals(newString.reverse().toString());
    }

    private boolean isLetter(char c) {
        return ((c <= 'z' && c >= 'a') || (c >= '0' && c <= '9'));
    }

}