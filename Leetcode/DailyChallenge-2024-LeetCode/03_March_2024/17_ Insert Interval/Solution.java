class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       int left = binarySearch(intervals, newInterval[0], false);
       int right = binarySearch(intervals, newInterval[1], true);

       int mergedStart = newInterval[0];
       int mergedEnd = newInterval[1];

       if (left > 0 && newInterval[0] <= intervals[left - 1][1]) {
           mergedStart = intervals[left - 1][0];
           left--;
       }

       if (right < intervals.length && newInterval[1] >= intervals[right][0]) {
           mergedEnd = intervals[right][1];
           right++;
       }

       int[][] ans = new int[intervals.length - (right - left) + 1][2];
       int counter = 0;

       for (int i = 0; i < left; i++) {
           ans[counter++] = intervals[i];
       }

       ans[counter++] = new int[]{mergedStart, mergedEnd};

       for (int i = right; i < intervals.length; i++) {
           ans[counter++] = intervals[i];
       }

       return ans;
   }

   private int binarySearch(int[][] intervals, int target, boolean isSearchingEnd) {
       int left = 0, right = intervals.length - 1;

       while (left <= right) {
           int mid = left + (right - left) / 2;
           int curNum = isSearchingEnd ? intervals[mid][1] : intervals[mid][0];

           if (curNum == target) {
               return mid;
           } else if (curNum < target) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }

       return left;
   }
}