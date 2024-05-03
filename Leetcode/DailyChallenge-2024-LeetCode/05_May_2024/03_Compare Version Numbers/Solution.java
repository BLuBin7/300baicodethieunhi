public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] revisions1 = version1.split("\\.");
        String[] revisions2 = version2.split("\\.");

        int length = Math.max(revisions1.length, revisions2.length);

        for (int i = 0; i < length; i++) {
            int rev1 = (i < revisions1.length) ? Integer.parseInt(revisions1[i]) : 0;
            int rev2 = (i < revisions2.length) ? Integer.parseInt(revisions2[i]) : 0;

            if (rev1 < rev2) {
                return -1;
            } else if (rev1 > rev2) {
                return 1;
            }
        }

        return 0;
    }
}