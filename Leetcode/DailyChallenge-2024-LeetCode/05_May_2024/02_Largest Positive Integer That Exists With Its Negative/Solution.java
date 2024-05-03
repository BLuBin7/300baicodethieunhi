// // #Two Pointers
// class Solution {
//     public int findMaxK(int[] nums) {
//         Arrays.sort(nums);
//         int left = 0;
//         int right = nums.length - 1;

//         while (left < right) {
//             int sum = nums[left] + nums[right];
//             if (sum == 0) {
//                 return nums[right];
//             }
//             if (sum < 0) {
//                 left++;
//             }
//             else if (sum > 0) {
//                 right--;
//             }
//         }
//         return -1;
//     }
// }

// #Hashset
// class Solution {
//     public int findMaxK(int[] nums) {
//         int max = nums[0];
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == 0) {
//                     count += 1;
//                     max = Math.abs(nums[i]);
//                     map.put(count, max);
//                 }
//             }
//         }
//         int maxValue = Integer.MIN_VALUE;
//         if (map.isEmpty()) {
//             return -1;
//         }
//         String maxKey = null;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > maxValue) {
//                 maxValue = entry.getValue();
//             }
//         }
//         return maxValue;
//     }
// }

/// Optimize Hashset
public class Solution {
    public int findMaxK(int[] nums) {
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(-num)) {
                max = Math.max(max, Math.abs(num));
            } else {
                set.add(num);
            }
        }
        
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}

