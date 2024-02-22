public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] judges = new int[n+1];
        for(int[] person:trust){
            judges[person[1]]++;
            judges[person[0]]--;
        }
        for(int i=1;i<=n;i++){
            if(judges[i] == n-1) return i;
        }
        return -1;
    }
}
