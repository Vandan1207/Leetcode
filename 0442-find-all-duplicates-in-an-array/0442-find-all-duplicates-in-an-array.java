class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int supp[] = new int [max+1];
        for(int i =0;i<nums.length;i++){
            supp[nums[i]]++;
        }
        for(int i =0;i<supp.length;i++){
            if(supp[i]>1){
                ans.add(i);
            }
        }

        return ans;

    }
}