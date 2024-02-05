class Solution {
    public int maxArea(int[] arr) {
        int maxArea = Integer.MIN_VALUE;
        int right=0;
        int left = arr.length-1;
        
        while(right != left){
            int leftValue = arr[left];
            int rightValue = arr[right];

             maxArea = Math.max(maxArea, Math.min(rightValue,leftValue)*(left-right));
             if (rightValue < leftValue){
                 right++;
             }
             else{
                 left--;
             }
        }
        return maxArea;
    }
}