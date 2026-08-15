class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // sort the array
        Arrays.sort(intervals, (row1, row2) -> Integer.compare(row1[1], row2[1]));
        int prevEnd = intervals[0][1];
        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                res++;
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna