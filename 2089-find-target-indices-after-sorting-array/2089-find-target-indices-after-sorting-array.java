import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int i ;
        
        for(i=0;i<nums.length ; i++){
            if(target==nums[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}