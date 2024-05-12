class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniquePointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePointer]) {
                nums[++uniquePointer] = nums[i];
            }
        }
        return uniquePointer + 1;
    }
}
