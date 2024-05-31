class Solution {
    public int thirdMax(int[] nums) {
        // Using a set to track distinct elements
        Set<Integer> distinctNums = new HashSet<>();
        
        for (int num : nums) {
            distinctNums.add(num);
        }
        
        // If there are less than three distinct elements, return the maximum
        if (distinctNums.size() < 3) {
            return Arrays.stream(nums).max().getAsInt();
        }
        
        // Remove the maximum element twice to get the third maximum
        for (int i = 0; i < 2; i++) {
            distinctNums.remove(Collections.max(distinctNums));
        }
        
        // The next maximum element is the third maximum
        return Collections.max(distinctNums);
    }
}