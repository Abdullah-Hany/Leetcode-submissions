class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return compute(a, b);
        }
        return compute(b, a);
    }

    private String compute(String small, String big) {
        StringBuilder answer = new StringBuilder();
        int bigPointer = big.length() - 1;
        int carryOver = 0;
        for (int i = small.length() - 1; i >= 0; i--) {
            int smallInt = small.charAt(i) - '0';
            int bigInt = big.charAt(bigPointer) - '0';
            int sum = smallInt + bigInt + carryOver;
            carryOver = appendAndGetCarryOver(answer, sum);

            bigPointer--;
        }

        while (bigPointer >= 0) {
            int sum = (big.charAt(bigPointer) - '0') + carryOver;
            carryOver = appendAndGetCarryOver(answer, sum);
            bigPointer--;
        }
        if (carryOver == 1) {
            answer.append(1);
        }
        return answer.reverse().toString();
    }

    private int appendAndGetCarryOver(StringBuilder answer, int sum) {
        int carryOver = 0;
        if (sum == 2) {
            answer.append(0);
            carryOver = 1;
        } else if (sum == 3) {
            answer.append(1);
            carryOver = 1;
        } else {
            answer.append(sum);
            carryOver = 0;
        }
        return carryOver;
    }
}