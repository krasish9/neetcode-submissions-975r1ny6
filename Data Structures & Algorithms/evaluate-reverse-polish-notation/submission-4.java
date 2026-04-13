class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(String str : tokens) {
            if(str.matches("-?\\d+")){
                dq.push(Integer.parseInt(str));
            } else {
                int num1 = dq.pop();
                int num2 = dq.pop();
                int num3;
                if(str.equals("+")){
                    num3 = num1+num2;
                } else if(str.equals("-")){
                    num3 = num2 - num1;
                } else if(str.equals("*")) {
                    num3 = num2*num1;
                } else {
                    num3 = num2/num1;
                } 
                dq.push(num3);
            }
        }
        return dq.pop();
    }
}
