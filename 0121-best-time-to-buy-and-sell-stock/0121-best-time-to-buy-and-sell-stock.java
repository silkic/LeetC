class Solution {
    public int maxProfit(int[] prices) {
        int maxprof = 0;
        int i = 0; int j = i+1;int sum = 0;
        while(j < prices.length){
            if(prices[i] < prices[j]){
                sum = prices[j] - prices[i];
                i++;
            }
            maxprof = Math.max(sum,maxprof);
        }
        return maxprof;
    }
}