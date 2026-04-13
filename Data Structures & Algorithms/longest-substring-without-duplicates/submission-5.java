class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int left = 0, right = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(left));
        int max = 1,count = 1;
        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                count++;
                set.add(s.charAt(right++));
            } else {
                max = Math.max(max,count);
                do {
                    set.remove(s.charAt(left));
                    count--;
                } while(s.charAt(left++) != s.charAt(right));
            }
        }
        return Math.max(max, count);
    }
}