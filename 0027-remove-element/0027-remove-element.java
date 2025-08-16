class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0,j=0;
        int ans=0;
        while(i<nums.length && j<nums.length){
            if(nums[j]!=val){
               int temp= nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               i++;
               ans++;
            }
            j++;
        }
        return ans;
    }
}