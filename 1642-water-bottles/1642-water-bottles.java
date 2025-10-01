class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        int emptyBottles = 0;
        ans+=numBottles;
        emptyBottles = numBottles;
        numBottles=0;
        while(emptyBottles>=numExchange){
            numBottles = emptyBottles/numExchange;
            emptyBottles=emptyBottles-        numBottles*numExchange;
            ans+=numBottles;
            emptyBottles+=numBottles;
            numBottles=0;
        }        

        return ans;


    }
}