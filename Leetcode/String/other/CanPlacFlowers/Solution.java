// 605. Can Place Flowers

public class Solution {
    boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    n--;
                }
            }
            System.out.println(flowerbed[i]);
        }
        return n<=0;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().canPlaceFlowers(new int[]{1,0,0,0,1},2));
    }
}
