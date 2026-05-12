class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
        {
            return 0;
        }
        Set<Integer> set = new HashSet<>();

        int max = 1;
        for (int num : nums)

        {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - 1)) {
                int curr = 1;

                int nxt = nums[i];
                while (set.contains(nxt)) {
                    curr++;
                    nxt++;
                }
                max = Math.max(curr, max);
            }
        }
        return max;
    }
}
