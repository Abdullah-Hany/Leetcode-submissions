class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] result = new int[temp.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int top = stack.pop();
                result[top] = i - top;
            }
            stack.push(i);
        }

        return result;
    }
}