class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int [] freq = new int[26];
        for(int index = 0; index < s.length(); index++) {
            freq[Character.toLowerCase(s.charAt(index)) - 'a']++;
            freq[Character.toLowerCase(t.charAt(index)) - 'a']--;
        }

       for(int count : freq) {
            if(count != 0) {
                return false;
            }
       }
       return true;
    }
}
