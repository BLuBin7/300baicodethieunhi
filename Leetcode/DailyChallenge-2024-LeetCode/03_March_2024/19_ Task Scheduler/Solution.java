class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] hashtable = new int[26];
        int maxFreq = 0;
        int numOfMaxFreq = 0;

        for (char task: tasks) {
            int i = task - 'A';
            hashtable[i]++;
            if (hashtable[i] > maxFreq) {
                maxFreq = hashtable[i];
                numOfMaxFreq = 1;
            } else if (hashtable[i] == maxFreq) {
                numOfMaxFreq++;
            }
        }

        return Math.max((n + 1) * (maxFreq - 1) + numOfMaxFreq, tasks.length);
    }
}