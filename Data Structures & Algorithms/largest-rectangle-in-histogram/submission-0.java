class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<=heights.length-1; i++) {
            int minHeight = Integer.MAX_VALUE;
            max = Math.max(max, heights[i]);
            for(int j = i+1; j<= heights.length-1; j++) {
                minHeight = Math.min(minHeight,Math.min(heights[i], heights[j]));
                max = Math.max(max, minHeight*(j-i+1));
                System.out.println(max);
            }
        }
        return max;
    }
}