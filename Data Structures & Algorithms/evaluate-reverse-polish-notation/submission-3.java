class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = Integer.parseInt(tokens[0]);
        stack.push(res);

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i].matches("-?\\d+")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();

                if (tokens[i].equals("+")) {
                    res = num2 + num1;
                } else if (tokens[i].equals("-")) {
                    res = num2 - num1;
                } else if (tokens[i].equals("*")) {
                    res = num2 * num1;
                } else {
                    res = num2 / num1;
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }
}