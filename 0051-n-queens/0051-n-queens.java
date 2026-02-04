class Solution {

    public boolean isSafe( List<String> board,int row,int col){

        // vertical check
        for(int i =0;i<row;i++){
            if(board.get(i).charAt(col)=='Q'){
                return false;
            }
        }
        // top left diagonal
        for(int i = row -1 , j =col-1; i>=0 && j>=0;i--,j--){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }

        // top right diagonal
        for(int i = row-1, j = col+1; i>=0 && j<board.size();i--,j++){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;

    }

    public void nQueen(List<List<String>> ans , List<String> board, int n ,int row){
        if(row == n){
            // we got our answer 
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int j =0;j<n;j++){
            if(isSafe(board,row,j)){
            String temp = board.get(row);
            board.set(row,temp.substring(0,j) + "Q" + temp.substring(j+1));
            nQueen(ans,board,n,row+1);
            board.set(row,temp);
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<String>board = new ArrayList<String>();
        for(int i =0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j =0;j<n;j++){
                sb.append(".");
            }
            board.add(sb.toString());
        }
        List<List<String>> ans = new ArrayList<>();
        nQueen(ans,board,n,0);
        return ans;
    }
}