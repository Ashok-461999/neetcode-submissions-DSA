class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
          for(int i=0;i<nums.length;i++)
          
          {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          }

          int arr[] = new int[k];
          List<Integer> lst = map.entrySet().stream()
          .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
          .limit(k).map(Map.Entry::getKey).collect(Collectors.toList());  

          for(int i=0;i<k;i++)
          {
            arr[i]=lst.get(i);
          }   
          return arr;   
    }
}
