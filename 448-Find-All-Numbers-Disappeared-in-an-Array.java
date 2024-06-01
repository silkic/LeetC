class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] aval = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++){
            aval[nums[i]-1] = true;
        }
        List<Integer> arr = new ArrayList<>();
            for(int i = 0; i<aval.length;i++){
                if(!aval[i]){
                    arr.add(i+1);
                }
            }
            return arr;
        }
}