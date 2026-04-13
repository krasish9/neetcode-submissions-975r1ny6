class Solution {
    public int maxArea(int[] heights) {
        int start = 0, end = heights.length -1;
        int max = Integer.MIN_VALUE;
        while(start < end) {
            max = Math.max(max,Math.min(heights[start],heights[end])*(end-start));

            if(heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
