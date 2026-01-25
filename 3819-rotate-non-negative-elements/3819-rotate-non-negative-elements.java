class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]>=0){
                arr.add(nums[i]);
            }
        }

        // operatiosn
        if(arr.size()>0){
            k=k%arr.size();
            while(k!=0){
                int temp = arr.get(0);
                arr.remove(0);
                arr.add(temp);
                k--;
            }
            int p=0;
            for(int i =0;i<nums.length;i++){
                if(nums[i]>=0){
                    nums[i]= arr.get(p++);
                }
            }    
        }

        return nums;
        
    }
}