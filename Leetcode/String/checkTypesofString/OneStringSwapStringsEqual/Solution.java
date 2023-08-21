//1790. Check if One String Swap Can Make Strings Equal

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // convert ve char
       char[] a = s2.toCharArray() ;
       // sap xep cac mang char
    //    Arrays.sort(a);

       if(s1.equals(s2)) return true;
        for (int i = 0; i <s2.length(); i++) {
           for(int j = i+1;j< s2.length();j++){
            // swap de kiem tra co trung khong
               char c = a[i];
               a[i] = a[j];
               a[j] = c;
                                //    mang cac char
               String temp = new String(a);
               if(s1.equals(temp)){
                   return true;
               }    
               // neu khong trung thi swap lai nhu ban dau
               a[j] = a[i];
               a[i] = c;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.areAlmostEqual("bank", "kanb"));
        String s1= "bank";
        char[] ab = s1.toCharArray();
        System.out.println(ab);
    }
}