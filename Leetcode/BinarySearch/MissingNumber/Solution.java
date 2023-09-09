import java.util.HashMap;

public class Solution {
    public int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public int missingNumber(int[] nums) {
        sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];
        int n = max - min;
        int avg = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && i != nums.length - 1 && nums[i] > nums[i - 1] &&
                    nums[i] < nums[i + 1]) {
                avg = (nums[i] + nums[i + 1]) / 2;
                System.out.println(avg);
            }
            map.put(i, nums[i]);
        }
        if (!map.containsValue(avg)) {
            return avg;
        }
        return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[] { 1, 2, 4, 5 }));
        // System.out.println(solution.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0,
        // 1 }));
    }
}
