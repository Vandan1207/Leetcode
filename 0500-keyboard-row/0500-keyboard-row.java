class Solution {
    public boolean inFirstRow(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'q' || str.charAt(i) == 'w' || str.charAt(i) == 'e' || str.charAt(i) == 'r'
                    || str.charAt(i) == 't' || str.charAt(i) == 'y' || str.charAt(i) == 'u' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'p') {
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean inSecRow(String str) {
        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 's' || str.charAt(i) == 'd' || str.charAt(i) == 'f'
                || str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'j' 
                || str.charAt(i) == 'k' || str.charAt(i) == 'l') {
        } else {
            return false;
        }
    }
    return true;

    }

    public boolean inThirdRow(String str) {
for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'z' || str.charAt(i) == 'x' || str.charAt(i) == 'c' 
                || str.charAt(i) == 'v' || str.charAt(i) == 'b' 
                || str.charAt(i) == 'n' || str.charAt(i) == 'm') {
        } else {
            return false;
        }
    }
    return true;

    }

    public String[] findWords(String[] words) {
        ArrayList<String> ans  = new ArrayList<>();
        for(int i =0;i<words.length;i++){
            if(inFirstRow(words[i].toLowerCase())|| inSecRow(words[i].toLowerCase())|| inThirdRow(words[i].toLowerCase())){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}