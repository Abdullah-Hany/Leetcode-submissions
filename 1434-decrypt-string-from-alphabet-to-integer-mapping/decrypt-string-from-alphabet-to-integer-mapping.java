class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int x = Integer.valueOf(s.charAt(i-2)-'0')*10;
                x+=Integer.valueOf(s.charAt(i-1)-'0')-1;
                sb.append((char)(x + 97));
                i -= 2;
            } else {
                sb.append((char)(s.charAt(i)-'0' + 96));
            }
        }
        return sb.reverse().toString();
    }
}