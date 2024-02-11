class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int temp = nums[i];
            boolean inLoop = false;
            while (i < length - 1 && nums[i] + 1 == nums[i + 1]) {
                inLoop = true;
                i++;
            }
            if (inLoop) {
                answer.add(temp + "->" + nums[i]);
            } else {
                answer.add("" + temp);
            }
        }
        return answer;

    }
}