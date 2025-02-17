class Solution {
    public int maximumProduct(int[] nums) {
        int prod = 0;
        int maxprod = Integer.MIN_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0; int j = i+1; int k = j+1;
        while(k < nums.length){
            prod =Math.max( nums[n-1] *nums[n-2] * nums[n-3], nums[n-1]*nums[0]*nums[1]);
            if(prod > maxprod){
                maxprod = prod;
            }
            i++;
            j++;
            k++;
        }
        return maxprod;
    }
}