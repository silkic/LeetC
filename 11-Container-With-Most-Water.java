class Solution {
    public int maxArea(int[] height) {
       int l =0;
       int r= height.length-1;;
       int water = 0;
       while(l < r){
       water = Math.max(water,Math.min(height[l],height[r])*(r-l));
       if(height[l] > height[r]){
        r--;
       }
       else{
        l++;
       }
       }
       return water;
    }
}