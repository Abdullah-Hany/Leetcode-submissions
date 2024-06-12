class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndex = Math.min(zeroIndex, i);
            } else if (i > zeroIndex) {
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                int temp = i;
                i = zeroIndex;
                zeroIndex = temp;
            }
        }

    }
}