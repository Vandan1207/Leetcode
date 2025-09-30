class Solution {
    public void helper(ArrayList<Integer> arr){
        if(arr.size()==1){
            return;
        }
        for(int i =0;i<arr.size()-1;i++){
            int sum = (arr.get(i)+arr.get(i+1));
            arr.set(i,(sum%10));
        }
        arr.remove(arr.size()-1);
        helper(arr);
    }
    public int triangularSum(int[] nums) {
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i =0;i<nums.length;i++){
            ans.add(nums[i]);
       }
       helper(ans);
       return ans.get(0);
    }
}