class Solution {
    public double myPow(double x, int n) {
        // BIT MANIPULATTION
        long N = n;
         if(N < 0){
            N = -N;
            x = 1 / x;
        }
        
        double ans =1;
        while(N>0){
            if((N&1)!=0){
                ans*=x;
            }
            x*=x;
            N=N>>1;
        }
        return ans;
    }
}