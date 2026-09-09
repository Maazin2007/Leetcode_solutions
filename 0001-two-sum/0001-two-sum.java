class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap to store the prev sums against their indexesd
        HashMap<Integer, Integer> map = new HashMap<>();
        // loop through the array
        for (int i = 0; i < nums.length; i++) {
            // first check if the diff with target exists in the map
            if (map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
            // if it is not contained we just add the current element and its index for later use
            map.put(nums[i], i);
        }
        // need a trash return value since result is garuntteed for compilation error avoiding
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna