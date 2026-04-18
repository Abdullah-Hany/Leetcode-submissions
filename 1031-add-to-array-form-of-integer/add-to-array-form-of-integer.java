class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carryover = k;
        for (int i = num.length - 1; i >= 0; i--) {
            int x = num[i] + carryover;
            if (x >= 10) {
                num[i] = x % 10;
                carryover = x / 10;
            } else {
                num[i] = x;
                return Arrays.stream(num)
                          .boxed() 
                          .collect(Collectors.toList());
            }
        }
        List<Integer> ans = Arrays.stream(num)
                          .boxed() 
                          .collect(Collectors.toList());
        // if (carryover != 0) {
        //     ans.add(0, carryover);
        // }

        while (carryover != 0) {
            ans.add(0,carryover%10);
            carryover/=10;
        }
        return ans;

    }
}