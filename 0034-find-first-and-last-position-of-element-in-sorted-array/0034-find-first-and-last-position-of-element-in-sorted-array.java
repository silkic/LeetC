class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
		int start = search(nums,target,true);
		int end = search(nums,target,false);
		res[0] = start;
		res[1] = end;
		return res;
		
	}
 private static int search( int[] arr, int target,boolean findStartInd) {
		// TODO Auto-generated method stub
	 int ans = -1;
	 int start = 0;
	 int end = arr.length-1;
	 while(start <= end) {
		 int mid = start + (end - start)/2;
		 if(arr[mid] < target) {
			 start = mid +1;
		 }
		 else if(arr[mid] > target) {
			 end =  mid-1;
		 }
		 //otherwise it will be equal, so return mid
		 else {
			 ans = mid;
			 if(findStartInd) {
				 end =  mid -1;
			 }
			 else {
				 start =  mid  + 1;
			 }
		 }}
		return ans;
    }
}