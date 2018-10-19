
class Solution {
    //O(n^2)
    public int[] twoSum_twoTraversal(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        for(int l = 0; l < nums.length; l++){
            for(int r = l + 1; r < nums.length; r++){
                if(nums[l] + nums[r] == target){
                    int[] result = new int[2];
                    result[0] = l;
                    result[1] = r;
                    return result;
                }
            }                
        }
        return null;
    }
    //O(n)
    public int[] twoSum_map(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int v = target - nums[i];
            if(map.containsKey(v)){
                int[] result = new int[2];
                result[0] = i;
                result[1] = map.get(v);
                return result;
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
