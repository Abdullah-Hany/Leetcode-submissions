class Solution {
    public int[] plusOne(int[] digits) {
        boolean hasCarry = false;
        int length = digits.length;
        if (digits[length - 1] + 1 > 9) {
            digits[length - 1] = 0;
            hasCarry = true;
        } else {
            digits[length - 1]++;
        }

        if (hasCarry) {
            for (int i = digits.length - 2; i >= 0; i--) {
                int number = digits[i];
                if (number + 1 > 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    hasCarry = false;
                    break;
                }
            }
        }
        if (hasCarry) {
            return IntStream.concat(IntStream.of(1), Arrays.stream(digits))
                    .toArray();
        }
        return digits;

    }
}