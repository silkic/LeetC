class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int res[] = new int[n]; 
        int prod =1;
        for(int i =0 ; i<n; i++){
             left[i] = prod;
             prod  *= nums[i];
    }
    prod =1;
    for(int j = n-1; j >= 0; j--){
        right[j] = prod;
        prod *= nums[j];
    }
    for(int i = 0; i< n; i++){
        res[i] = left[i] * right[i];
    }
    return res;
}}