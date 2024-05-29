class Solution {
    public int search(int[] nums, int target) {
        	int pivot= findPivot(nums);
            if(pivot == -1){
                return binarysearch(nums,target,0,nums.length-1);
            }
            if(nums[pivot] == target){
                return pivot;
            }
            if(nums[0] <= target )
            {
                return binarysearch(nums,target,0,pivot -1);
            }
            else{
                return binarysearch(nums,target,pivot+1,nums.length-1);
                            }}

    static int findPivot(int[] nums){
        int start = 0;
        int end =  nums.length -1;
		while(start <= end) {
			int mid = start +(end - start)/2;
			if( mid > start && nums[mid] < nums[mid-1]) {
				return mid-1;
			}
			else if(mid < end && nums[mid] > nums[mid + 1]) {
				return mid;
			}
			if(nums[start] <= nums[mid]) {
				start = mid+1;
			}
			else
			{
				end = mid -1;
			}
	}
		return -1;
    }
    static int binarysearch(int[] arr, int target, int start, int end){
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
			 return mid;
		 }}
		return -1;
}}