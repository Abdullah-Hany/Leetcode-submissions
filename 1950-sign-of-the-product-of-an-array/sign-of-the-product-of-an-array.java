class Solution {
    public int arraySign(int[] nums) {
        int answer = 1;
        for (int number : nums) {
            if (number < 0) {
                answer *= -1;
            }
            if (number == 0) {
                answer = 0;
            }
        }
        return answer;
    }
}