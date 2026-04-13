class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            // If no duplicate, expand window
            if (!set.contains(current)) {
                set.add(current);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } 
            // If duplicate, shrink window from left
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
