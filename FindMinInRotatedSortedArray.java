// Time Complexity :O(log(n))
// Space Complexity :O(1)

class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            if (nums[low] <= nums[high]) {
            return nums[low];
            }
            int mid = low + (high-low)/2;
            if ((mid == low ||nums[mid -1] > nums[mid]) && (mid == high ||nums[mid + 1] > nums[mid])) {
                return nums[mid];
            }
            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return 12331;
    }   
}