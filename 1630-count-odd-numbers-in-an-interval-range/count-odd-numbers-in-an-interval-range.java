class Solution {
    public int countOdds(int low, int high) {
        int sum = high - low + 1;
        if (sum % 2 == 0 || low % 2 == 0) {
            return sum / 2;
        }
        return (sum + 1) / 2;
    }
}