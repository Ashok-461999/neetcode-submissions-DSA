class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> lst = map.entrySet()
                                .stream()
                                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                                .limit(k)
                                .map(Map.Entry::getKey)
                                .collect(Collectors.toList());

        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = lst.get(i);
        }
        return topK;
    }
}
