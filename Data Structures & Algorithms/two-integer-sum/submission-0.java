class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> d = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            // Capitalize the 'K' in containsKey
            if(d.containsKey(complement)){
                return new int[] { d.get(complement), i };
            }
            
            d.put(nums[i], i);
        }
        
        return new int[]{};
    }
}