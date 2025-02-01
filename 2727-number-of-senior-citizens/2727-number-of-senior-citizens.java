class Solution {
    public int countSeniors(String[] details) {
        int ans =0;
        for(int i =0;i<details.length;i++){
            String curr = details[i];
            String str="";
            str+=curr.charAt(11);
            str+=curr.charAt(12);
            int n = Integer.parseInt(str);
            if(n>60){
                ans++;
            } 
        }
        return ans;
    }
}