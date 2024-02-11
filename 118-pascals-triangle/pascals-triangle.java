class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(List.of(1));

        for (int counter = 1; counter < numRows; counter++) {
            List<Integer> newList = new ArrayList<>();
            List<Integer> prevList = answer.get(counter - 1);
            newList.add(1);
            for (int i = 1; i < counter; i++) {
                newList.add(prevList.get(i) + prevList.get(i - 1));
            }
            newList.add(1);
            answer.add(newList);
        }

        return answer;
    }
}