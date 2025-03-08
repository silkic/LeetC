class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        for(int i = 0; i < k;i++){
            lsum += nums[i];
            maxsum = lsum;
            int rindex = nums.length-1;
            for(int j = k-1; j > 0; j--){
                lsum -= nums[j];
                rsum += nums[rindex];
                rindex--;
            }
            maxsum = Math.max(maxsum, rsum+lsum);
        }
        return maxsum;
    }
}