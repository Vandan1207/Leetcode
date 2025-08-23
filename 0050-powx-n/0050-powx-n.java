class Solution {
    public double myPow(double x, int n) {
          long N = n;
            if(n<0){
                 N=N*-1;
                x=1/x;
            }
            double ans = 1;
            while(N!=0){
                if((N&1)==1){
                    ans = ans *x;
                }
                x*=x;
                N=N>>1;
            }
            

            return ans;
    }
}