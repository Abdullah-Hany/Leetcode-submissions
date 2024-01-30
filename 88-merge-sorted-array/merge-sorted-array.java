class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstCounter = m - 1;
        int secondCounter = n - 1;
        int counter = nums1.length - 1;

        while (firstCounter != -1 && secondCounter != -1) {
            if (nums1[firstCounter] >= nums2[secondCounter]) {
                nums1[counter--] = nums1[firstCounter--];
            } else {
                nums1[counter--] = nums2[secondCounter--];
            }
        }
        while(firstCounter >= 0){
            nums1[counter--] = nums1[firstCounter--];
        }
        while(secondCounter >= 0){
            nums1[counter--] = nums2[secondCounter--];
        }
    }
}