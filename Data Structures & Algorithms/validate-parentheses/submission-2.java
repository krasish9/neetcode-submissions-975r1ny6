class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<=s.length()-1; i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) =='(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                if(stack.size() == 0) {
                    return false;
                }
                char tmp = stack.pop();
                if(tmp != '['){
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if(stack.size() == 0) {
                    return false;
                }
                char tmp = stack.pop();
                if(tmp != '{'){
                    return false;
                }
            } else if (s.charAt(i) == ')') {
                if(stack.size() == 0) {
                    return false;
                }
                char tmp = stack.pop();
                if(tmp != '('){
                    return false;
                }
            } else {
                return false;
            }
        }

        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
