class Solution {
    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                stringBuilder.append((char) (s.charAt(i) + 32));
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}