import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<List<String>> res = new ArrayList<>();
        
        for (String str : strs) {
            String key = createKey(str);
            
            if (map.containsKey(key)) {
                // If it exists, grab the existing mutable list and add to it
                res.get(map.get(key)).add(str);
            } else {
                // BUG FIX: Create a mutable ArrayList wrapper so you can add to it later
                res.add(new ArrayList<>(List.of(str)));
                // Track the index of this newly added list
                map.put(key, res.size() - 1);    
            }
        }
        return res;
    }

    private String createKey(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                // BUG FIX: Cast to char, otherwise it appends the integer ASCII value
                sb.append((char)('a' + i));
                sb.append('-');
                sb.append(freq[i]);
            }
        }
        return sb.toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna