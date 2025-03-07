class Solution {
    public int helper(int[] nums, int k){
        if(k < 0 ) return 0;
        int l = 0; int r = 0;
        int cnt = 0; int sum = 0;
        while(r < nums.length){
            sum += nums[r] % 2;
            while(sum > k){
                sum -= nums[l] % 2;
                l++;
            }
            r++;
            cnt += r-l+1;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
}