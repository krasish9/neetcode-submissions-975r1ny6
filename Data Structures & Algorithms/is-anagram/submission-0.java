class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for(int index = 0; index <= sChar.length -1; index++) {
            if(sChar[index] != tChar[index]) {
                return false;
            }
        }
        return true;
    }
}
