class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int[temperatures.length];

        for(int i = 0; i<= result.length-1; i++) {
            int curr = temperatures[i];
            for(int j = i+1; j <= temperatures.length-1; j++) {
                if(curr < temperatures[j]) {
                    result[i] = j-i;
                    break;
                }
            }
        }
        return result;
    }
}
