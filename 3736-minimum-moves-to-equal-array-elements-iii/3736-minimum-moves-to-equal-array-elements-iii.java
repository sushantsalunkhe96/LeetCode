class Solution {
    public int minMoves(int[] nums) {
        int i;
        int max=nums[0];
        int moves=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(i=0;i<nums.length;i++){
            moves=moves + (max-nums[i]);
        }
        return moves;
    }
}