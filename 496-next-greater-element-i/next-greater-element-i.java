class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(nums2[nums2.length - 1], -1);
        for (int i = nums2.length - 2; i >= 0; i--) {
            if (nums2[i] > nums2[i + 1]) {
                int value = map.get(nums2[i + 1]);
                while(value != -1 && nums2[i]>value){
                    value=map.get(value);
                }
                map.put(nums2[i], value);
            } else {
                map.put(nums2[i], nums2[i + 1]);
            }
        }
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            answer[i] = map.get(nums1[i]);
        }
        return answer;
    }
}