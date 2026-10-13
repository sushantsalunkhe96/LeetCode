class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int count=0;

        while(i<=j){
            int mid = (i+j)/2;

            if(target==nums[mid]){
                count++;
                return mid;
            }
            else if(target>nums[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
}