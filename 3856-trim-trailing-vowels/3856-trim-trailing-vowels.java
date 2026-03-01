class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length()-1;
        while(n>=0 && (s.charAt(n)=='a'||s.charAt(n)=='e'||s.charAt(n)=='i'||s.charAt(n)=='o'||s.charAt(n)=='u')){
            n--;
        }
        if(n==-1){
            return "";
        }
        return s.substring(0,n+1);
    }
}