class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int i=0,j=0;
        while(i<=nums.length-1 && j<=nums.length -1){
            if(nums[i]==nums[j]){
                j++;
            }else{
                int temp = nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
                k++;
                j++;
            }
        }
        return k;
    }
}