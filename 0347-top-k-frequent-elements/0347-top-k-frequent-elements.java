class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // okay so lets make some code lets solve this 
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        HashMap<Integer, Integer> map = new HashMap<>();

        // get the frequency
        for (int num : nums) {
            int freq = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, freq);
        }
        // Priority Queue
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            pq.offer(x);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey(); // Safely pulls the highest frequencies
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna