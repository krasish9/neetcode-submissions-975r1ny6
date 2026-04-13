class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        Map<Integer, Integer> sortedMap = map.entrySet().stream()
           .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
           .collect(Collectors.toMap(
               Map.Entry::getKey,
               Map.Entry::getValue,
               (e1, e2) -> e1,
               LinkedHashMap::new
            )
        );
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m : sortedMap.entrySet()) {
            if(k-- > 0) {
                res.add(m.getKey());
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
