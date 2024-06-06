class Solution {
    public int nearestValidPoint(int x, int y, int[][] point) {
        int minIndex = point.length;
        int minDistance = Integer.MAX_VALUE;
        for (int i = point.length - 1; i >= 0; i--) {
            int x2 = point[i][0];
            int y2 = point[i][1];

            if (x2 == x || y2 == y) {
                int distance = Math.abs(x - x2) + Math.abs(y - y2);
                if (distance <= minDistance) {
                    minIndex = i;
                    minDistance = distance;
                }
            }

        }

        return minIndex == point.length ? -1 : minIndex;
    }
}