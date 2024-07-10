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
            int [] newArr = new int[digits.length+1];
        newArr[0] = 1;
        System.arraycopy(digits, 0, newArr, 1, digits.length);
        return newArr;   
        }
        return digits;

    }
}