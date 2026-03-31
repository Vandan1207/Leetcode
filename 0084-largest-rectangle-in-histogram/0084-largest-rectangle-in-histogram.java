class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int n = heights.length;
        int leftMax[]= new int[n];
        int rightMax[]= new int[n];

        for(int i=0;i<n;i++){
            int curr = heights[i];
            while(!s1.isEmpty() && heights[s1.peek()]>=curr){
                s1.pop();
            }
            if(s1.isEmpty()){
                leftMax[i]= -1;
            }else{
                leftMax[i] = s1.peek();
            }
            s1.push(i);
        }

        for(int i=n-1;i>=0;i--){
            int curr = heights[i];
            while(!s2.isEmpty() && heights[s2.peek()]>=curr){
                s2.pop();
            }

            if(s2.isEmpty()){
                rightMax[i]=n;
            }else{
                rightMax[i] = s2.peek();
            }
            s2.push(i);
        }

        int maxArea =0;
        for(int i=0;i<n;i++){
            int area = (rightMax[i] - leftMax[i] -1) * heights[i] ;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;



    }
}