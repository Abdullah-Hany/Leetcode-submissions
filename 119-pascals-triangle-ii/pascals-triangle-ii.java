class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(List.of(1));
        for (int i = 1; i < rowIndex+1; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = answer.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            answer.add(row);
        }
        return answer.get(rowIndex);
    }
}