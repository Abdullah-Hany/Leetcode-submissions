class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[128];
        int[] tArr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (arr[sc] != tArr[tc]) {
                return false;
            }
            arr[sc] = i + 1;
            tArr[tc] = i + 1;
        }
        return true;
    }
}