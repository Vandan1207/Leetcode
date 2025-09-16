class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        char LastLetter = s.charAt(i);
        while(LastLetter == ' '){
            i--;
            LastLetter=s.charAt(i);
        }
        int ans =0;
        while(i>0 && LastLetter != ' '){
            i--;
            LastLetter = s.charAt(i);
            ans++;
        }
        if(s.charAt(i)!=' '){
            ans++;
        }
        return ans;
    }
}