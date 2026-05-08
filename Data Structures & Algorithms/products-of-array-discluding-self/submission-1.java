class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];
        prefixSum[0] = 1;
        suffixSum[nums.length - 1] = 1;
        int[] result = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] * nums[i - 1];
        }
        // System.out.println(Arrays.toString(prefixSum));
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixSum[i] * suffixSum[i];
        }

        return result;
    }
}
