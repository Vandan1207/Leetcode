class Solution {
    public char findTheDifference(String s, String t) {
        int lettersInS [] = new int [26];
        int lettersInT [] = new int [26];
        for(int i =0;i<s.length();i++){
            lettersInS[s.charAt(i)-'a']++;
        }
        for(int i =0;i<t.length();i++){
            lettersInT[t.charAt(i)-'a']++; 
        }
        for(int i=0;i<26;i++){
            if(lettersInS[i]!=lettersInT[i]){
                return(char)('a'+ i) ;
            }
        }
        return 'a';
    }
}