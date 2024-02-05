class Solution {
    public int maxArea(int[] arr) {
        int maxArea = Integer.MIN_VALUE;
        int right=0;
        int left = arr.length-1;
        
        while(right != left){
             maxArea = Math.max(maxArea, Math.min(arr[right],arr[left])*(left-right));
             if (arr[right] < arr[left]){
                 right++;
             }
             else{
                 left--;
             }
        }
        return maxArea;
    }
}