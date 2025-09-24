class Solution {

    public  String map[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public  void helper(String digit,List<String>ans,String temp, int index){
        if(index== digit.length()){
            ans.add(temp);
            return;
        }
        
        String curr = map[digit.charAt(index)-'0'];
        System.out.println(curr);
        for(int i =0;i<curr.length();i++){
            helper(digit,ans,temp+curr.charAt(i),index+1);
        }
        
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if(digits.length()==0){
            return ans;
        }
        helper(digits,ans,"",0);
        return ans;
    }
}