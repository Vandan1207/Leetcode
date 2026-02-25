class Solution {


    
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int prevSmallest[] = new int[n];
        Stack<Integer> s1 = new Stack<>();
        for(int i =0;i<n;i++){
            while(!s1.isEmpty() && heights[s1.peek()]>= heights[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                prevSmallest[i] = -1;
            }else{
                prevSmallest[i] = s1.peek();
            }
                s1.push(i);
        }

        int nextSmallest[] = new int[n];
        Stack<Integer> s2 = new Stack<>();
        for(int i=n-1;i>=0;i--){
              while(!s2.isEmpty() && heights[s2.peek()]>= heights[i]){
                s2.pop();
            }
            if(s2.isEmpty()){
                nextSmallest[i] = n;
            }else{
                nextSmallest[i] = s2.peek();
            }
                s2.push(i);
        }
        int maxArea = 0;
        for(int i =0;i<n;i++){
            int length =heights[i];
            int breath = nextSmallest[i] - prevSmallest[i] -1 ;
            int area = length * breath;
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;    
    }
}