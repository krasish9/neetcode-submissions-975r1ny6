class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int [] res = new int[temperatures.length];
        for(int index = 0; index < temperatures.length ; index++) {
            while(!stack.isEmpty() && temperatures[index] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = index - prevIndex;
            } 
            stack.push(index);
        }
        return res;
    }
}
