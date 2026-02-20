class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '['|| curr == '{' || curr == '('){
                st.push(curr);            
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    // checks for closing one
                    if(curr ==')'){
                        if(!(st.peek() == '(')){
                            return false;
                        }
                    }else if(curr == '}'){
                        if(!(st.peek() == '{')){
                            return false;
                        }
                    }else{
                        if(!(st.peek() == '[')){
                            return false;
                        }
                    }
                    st.pop();
                }
            }
        }
        return st.size()==0;
    }
}