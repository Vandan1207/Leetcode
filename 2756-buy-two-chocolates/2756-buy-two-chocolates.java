import java.util.*;
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans=money;
        int n =2;
        for(int i=0;i<prices.length;i++){
            if(n==0){
                return money;
            }
            if(prices[i]<=money){
                money=money-prices[i];
                n--;
            }
        }
        if(n==0){
                return money;
        }
        return ans;
    }
}