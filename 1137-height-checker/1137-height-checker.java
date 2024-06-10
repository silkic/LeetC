class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int[] expected = sorted;
        int cnt = 0;
        for(int i = 0; i < heights.length;i++){
                if(heights[i] != expected[i]){
                    cnt++;
                }
        }
        return cnt;
    }
}