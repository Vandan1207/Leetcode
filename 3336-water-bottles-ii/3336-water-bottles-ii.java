class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans =0;
        int emptyBottles=0;
        ans+=numBottles;
        emptyBottles=numBottles;
        numBottles=0;
        while(emptyBottles>=numExchange){
            numBottles++;
            emptyBottles= emptyBottles-numExchange;
            numExchange++;
            if(numBottles>0){
                emptyBottles+=numBottles;
                numBottles=0;
                ans++;
            }
        }
        return ans;
    }
}