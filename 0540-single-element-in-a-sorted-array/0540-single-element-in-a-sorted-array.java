class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0; int high = nums.length-1;
        while(low < high){
            int mid = (low + high)/2;
            for(int i = 0; i<nums.length;i++){
                if(mid % 2 == 1){
                    mid--;
                }
                if(nums[mid] != nums[mid+1]){
                    high= mid;
                }
                else{
                    low = mid+2;
                }
            }
        }
        return nums[low];
    }
}