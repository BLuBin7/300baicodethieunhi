class Solution {
    public int tribonacci(int n) {
        int T_0 = 0;
        int T_1 = 1;
        int T_2 = 1;
        int T_n = 1;
        if(n < 0) {
            return -1;
        } 
        else if(n==0){
            return 0;
        }
        else if(n == 1 || n == 2 ){
            return 1;
        }
        else{
            for(int i = 3; i <= n ; i++){
                T_n = T_0 + T_1 + T_2;
                T_0 = T_1; 
                T_1 = T_2;
                T_2 = T_n;
            }
            return T_n;
        }
    }
}