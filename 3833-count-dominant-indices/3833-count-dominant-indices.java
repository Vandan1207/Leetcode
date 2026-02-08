class Solution {
    public int dominantIndices(int[] nums) {
        int sum =0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            sum+=nums[i];
        }
        int count =0;
        for(int i =1;i<=n-1;i++){
            int currSum = sum - nums[i-1];
            int currAvg = currSum/(n-i);
            if(nums[i-1]>currAvg){
                count++;
            }
            sum = currSum;
        }
        return count;

    }
}