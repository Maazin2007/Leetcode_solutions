class Solution {
    public boolean containsDuplicate(int[] nums) {
        // get the hashet for the array
        HashSet<Integer> hashset = new HashSet<>();
        for (int num : nums) hashset.add(num);
        return !(hashset.size() == nums.length);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna