class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        List<Integer> list = map.entrySet()
                                 .stream()
                                 .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                                 .limit(k)
                                 .map(Map.Entry::getKey)
                                 .collect(Collectors.toList());

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
