class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
        int odd = 3;
        int counter;
        int pointer = -1;

        while (odd <= arr.length) {
            counter = odd - 1;
            while (counter < arr.length) {
                if (pointer == -1) {
                    sum += arr[counter];
                } else {
                    int number = arr[counter] - arr[pointer];
                    sum += number;
                }
                pointer++;
                counter++;
            }
            pointer = -1;
            odd += 2;
        }

        return sum;
    }
}