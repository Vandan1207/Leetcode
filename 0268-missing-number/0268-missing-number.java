class Solution {
    public int missingNumber(int[] nums) {
        // ^ xor , 0^a =a, a^a=0
        int max = -1;
        for(int i =0;i<nums.length;i++){
            max= Math.max(max,nums[i]);
        }
        int ans =0;
        for(int q=0;q<=max;q++){
            ans^=q;
        }
        for(int p =0;p<nums.length;p++){
            ans^=nums[p];
        }
        /*
        *untill now what we did
        we xor all the numbers in the array with 0 to max
        now if ans =0 , then their are two things to check for , either 0 is missing for max+1 is missing
         */
        if(ans==0){
            for(int x=0;x<nums.length;x++){
                if(nums[x]==0){
                    return max+1;
                }
            }
            return 0;
        }

        return ans;
    }
}