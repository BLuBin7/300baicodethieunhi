class Solution {
    public String maximumOddBinaryNumber(String s) {
        int num1 = 0;
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                num1++;
            }
        }

        num1--;

        for (int i = 0; i < s.length() - 1; i++) {
            if (num1 > 0) {
                strBuilder.append('1');
                num1--;
            } else {
                strBuilder.append('0');
            }
        }

        strBuilder.append('1');

        return strBuilder.toString();
    }
}