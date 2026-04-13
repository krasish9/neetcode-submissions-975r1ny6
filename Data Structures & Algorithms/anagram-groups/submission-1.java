class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int index = 0; index < strs.length; index++) {
            char[] strsArr = strs[index].toCharArray();
            Arrays.sort(strsArr);
            String str = new String(strsArr);
            if(!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
           map.get(str).add(strs[index]);
        }
        List<List<String>> res = new ArrayList<>();

        res.addAll(map.values());
        return res;
    }
}
