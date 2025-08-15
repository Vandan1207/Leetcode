class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
            their are 2 elements that can give us a unique approach to solve this roblem
            (n-1,0) or (0,m-1)
         */   
         int n = matrix.length-1, m = 0;
         while(m<matrix[0].length && n>=0){
            if(matrix[n][m]==target){
                return true;
            }
            else if(matrix[n][m]>target){
                n--;
            }else{
                m++;
            }
         }

         return false;
    }
}