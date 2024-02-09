class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int answer = 0;
        boolean[] visited = new boolean[265];

        while (right < s.length()) {
            char current = s.charAt(right);
            while (visited[current]) {
                visited[s.charAt(left)] = false;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
            visited[current] = true;
            right++;
        }

        return answer;
    }
}