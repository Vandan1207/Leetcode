class Solution {         
    public void makeZero(int matrix[][],int row, int col){
        for(int i =0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
        for(int j=0;j<matrix[0].length;j++){
            matrix[row][j]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        /**
            lets travese the matrix , when we find a 0, we will make the whole row 0 and col a 0
         */
         int ans[][]= new int [matrix.length][matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[i][j]=matrix[i][j];
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(ans[i][j]==0){
                    makeZero(matrix,i,j);
                }
            }
        }

    }
}