class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int sum = 0;
        int slidingWindowPointer = 0;
        int answer = arr.length+1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= target) {
                answer = Math.min(answer, i - slidingWindowPointer + 1);
                sum -= arr[slidingWindowPointer];
                slidingWindowPointer++;
            }
        }
        return answer == arr.length+1 ? 0 : answer;
    }
}