class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int si =1;
        int ei = x-1;
        int ans =0;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            long check = (long) mid*mid;
            if(check==x){
                return mid;
            }else if(check<x){
                ans=mid;
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ans;

    }
}