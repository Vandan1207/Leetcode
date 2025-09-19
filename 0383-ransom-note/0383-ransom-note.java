class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int mag[]= new int[26];
        for(int j =0;j<magazine.length();j++){
            mag[magazine.charAt(j)-'a']++;
        }
        for(int i =0;i<ransomNote.length();i++){
            if(mag[ransomNote.charAt(i)-'a']!=0){
                mag[ransomNote.charAt(i)-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}