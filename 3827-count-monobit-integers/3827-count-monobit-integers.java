class Solution {
    public int countMonobit(int n) {
        int count =1;
        int k = 1;
        while(Math.pow(2,k)-1<=n){
                count++;
                k++;
        }
        
        return count;
        
    }
}