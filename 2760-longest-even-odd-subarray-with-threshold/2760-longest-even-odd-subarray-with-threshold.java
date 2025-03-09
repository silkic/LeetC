class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int l = 0; int r = 0;
        int maxsum = 0;
        if(nums.length == 1 ){
            if(nums[0] % 2 == 0 && nums[0] <= threshold){
                return 1;
            }
        }
        if(nums.length == 0){
            return 0;
        }
        while(r < nums.length-1){
            int first = nums[l];
            if(first % 2 != 0){
                first++;
            }
            if((nums[r] % 2 != nums[r+1] % 2) && nums[l] <= threshold && nums[r] <= threshold){
                maxsum = Math.max(r-l+1,maxsum);
            }
            r++;
        }
        return maxsum;
    }
}