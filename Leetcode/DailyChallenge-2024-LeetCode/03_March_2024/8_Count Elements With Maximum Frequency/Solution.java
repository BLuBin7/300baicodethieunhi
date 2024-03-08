import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] hashtable = new int[101];
        int ans = 0;
        for (int num: nums) {
            hashtable[num]++;
            if (hashtable[num] > max) {
                ans = hashtable[num];
                max = hashtable[num];
            } else if (hashtable[num] == max) {
                ans += hashtable[num];
            }
        }
        return ans;
    }
    //Solution 2
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        Collection<Integer> values = counter.values();
        int maxFrequency = Collections.max(values);
        return values.stream()
                .filter(t -> t == maxFrequency)
                .mapToInt(Integer::intValue)
                .sum();
    }
}