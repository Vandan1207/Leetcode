class Solution {
    public boolean isVowel(char c){
        return c=='a'|| c=='e' || c=='i'|| c=='o' || c=='u'|| c== 'A' || c =='E' || c=='I' || c== 'O' || c=='U';
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s); 
        int si = 0;
        int ei = sb.length() - 1;
        
        while (si < ei) {
            if (isVowel(sb.charAt(si)) && isVowel(sb.charAt(ei))) {
                char temp = sb.charAt(si);
                sb.setCharAt(si, sb.charAt(ei));
                sb.setCharAt(ei, temp);
                si++;
                ei--;
            } 
            else if (!isVowel(sb.charAt(si))) {
                si++;
            } 
            else {
                ei--;
            }
        }
        
        return sb.toString();
    }
}