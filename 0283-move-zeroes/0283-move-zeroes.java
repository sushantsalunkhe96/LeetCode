class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;

        for(i=0;i<=nums.length-1;i++){
            if(nums[i]==0){
            for(j=i+1;j<=nums.length-1;j++){
                if(nums[j]!=0){
                    nums[i]=nums[i] ^ nums[j];
                    nums[j]=nums[i] ^ nums[j];
                     nums[i]=nums[i] ^ nums[j];
                     break;
                }
            }
        }
        }
    }
}