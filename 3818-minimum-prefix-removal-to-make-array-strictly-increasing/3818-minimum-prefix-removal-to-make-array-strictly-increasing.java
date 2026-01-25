class Solution {
    public int minimumPrefixLength(int[] nums) {
        int index = -1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                index = i;
            }
        }
       return index== -1?0: index+1;
    }
}