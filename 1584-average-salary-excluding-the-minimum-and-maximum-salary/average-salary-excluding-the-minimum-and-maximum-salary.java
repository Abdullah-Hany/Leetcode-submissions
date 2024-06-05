class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double total=salary[0];

        for (int i =1;i<salary.length;i++){
            total+=salary[i];
            min = Math.min(salary[i],min);
            max = Math.max(salary[i],max);
        }
        total -= (max+min);
        return total/(salary.length-2);

    }
}