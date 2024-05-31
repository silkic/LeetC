class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i =0; i< nums.length;i++ ){
            if(nums[i] == 0){
                temp++;
            }
            else if(temp > 0){
                int t = nums[i];
                nums[i]= 0;
                nums[i - temp] = t;
            }
        }
    }
}