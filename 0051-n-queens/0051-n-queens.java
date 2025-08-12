class Solution {
    public void mapper(ArrayList<ArrayList<String>> help , List<List<String>> ans, int n){
        List<String> ll = new ArrayList<>();
        for(int i =0;i<n;i++){
            String temp ="";
            for(int j =0;j<n;j++){
                temp+=help.get(i).get(j);
            }
            ll.add(temp);
        }
        ans.add(ll);
    }

    public boolean check(ArrayList<ArrayList<String>> list , int row , int col,int n){
        // row check
        int i = row;
        while(i>=0){
            if(list.get(i).get(col)=="Q"){
                return false;
            }
            i--;
        }

        // left diagonal check
        int j = col;
        i=row;
        while(i>=0 && j>= 0){
            if(list.get(i).get(j)=="Q"){
                return false;
            }
            i--;j--;
        }

        // right diagonal 
        i=row;j=col;
        while(i>=0 && j<n){
            if(list.get(i).get(j)=="Q"){
                return false;
            }
            i--;j++;
        }
        return true;
    }
    
    public void helper( ArrayList<ArrayList<String>> help , List<List<String>> ans , int row ,int col, int n ){
        if(row==n){
            mapper(help,ans,n);
            return;
        }else if(col==n){
            return;
        }


        if(check(help,row,col,n)){
         help.get(row).set(col,"Q");
         helper(help,ans,row+1,0,n);
         help.get(row).set(col,".");
        }
        helper(help,ans,row,col+1,n);
        
      
    }


    public List<List<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> help = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<String>temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add(".");
            }
            help.add(temp);
        }

        helper(help,ans,0,0,n);

        return ans;
    }
}