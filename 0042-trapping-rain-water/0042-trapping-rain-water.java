class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // waterlvl = watersor - height 
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for(int i =1;i<n;i++){
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
        }
        
        int rightmax[]= new int[n];
        rightmax[n-1]= height[n-1];
        for(int j=n-2;j>=0;j--){
            rightmax[j]=Math.max(rightmax[j+1],height[j]);
        }
        int waterlvl=0;
        for(int i =0;i<n;i++){
              waterlvl+=Math.min(rightmax[i],leftmax[i])-height[i];
        }

        return waterlvl;

    }
}