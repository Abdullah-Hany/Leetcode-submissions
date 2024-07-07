class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int answer = numBottles;

        while (empty >= numExchange) {
            int left = empty / numExchange;
            answer += left;
            empty = left + (empty%numExchange);
        }
        return answer;
    }
}