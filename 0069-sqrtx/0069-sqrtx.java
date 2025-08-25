class Solution {
    public int mySqrt(int x) {
        int si =0;
        int ei = x;
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