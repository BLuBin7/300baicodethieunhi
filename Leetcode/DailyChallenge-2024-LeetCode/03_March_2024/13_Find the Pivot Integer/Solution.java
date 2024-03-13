class Solution {
    public int pivotInteger(int n) {
         int rs = -1;
         if(n == 1){
             return 1;
         }
         for (int i = 1; i < n; i++){
             if( ((1+i)*i/2) == ((i+n)*(n-i+1)/2) ){
                 rs = i;
                 break;
             }
         }
         return rs;
     }
 }