class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int doubleNumber = target - nums[i];
            if(map.containsKey(doubleNumber)){
                return new int[]{map.get(doubleNumber), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No sum numbers");
        
    }
}