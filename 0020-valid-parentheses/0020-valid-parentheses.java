class Solution {
    public boolean isValid(String s) {
        /*
        * aagar humko (,{ ,[ aave to push karvano.
            otherwise peek before  pop , and peek ma aanu opposite na hoy to return false
         */
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            switch (curr) {
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '(':
                    stack.push('(');
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}