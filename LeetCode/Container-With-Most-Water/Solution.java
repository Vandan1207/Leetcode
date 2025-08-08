class Solution {
    public int maxArea(int[] height) {
        int si =0, ei = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(si<ei){
            int width = ei -si;
            int minHeight = Math.min(height[si],height[ei]);
            int area= width*minHeight;
            if(area>maxArea){
                maxArea=area;
            }
            if(height[si]<=height[ei]){
                si++;
            }else{
                ei--;
            }
        }
        return maxArea;
    }
}