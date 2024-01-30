class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        int[] arr = new int[200];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            Character value = map.get(sc);
            if (value == null && arr[tc] == 0) {
                map.put(sc, tc);
                arr[tc]++;
            } else if (value == null || value != tc) {
                return false;
            }
        }
        return true;
    }
}