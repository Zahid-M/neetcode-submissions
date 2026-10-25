class Solution {
    public int search(int[] nums, int target)
    {
        boolean isFound = false;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if (nums[mid] > target)
            {
                right = mid - 1;
            }
            else if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else if(right - left == 0)
            {
                return -1;
            }

        }
    return -1;             
    }
}
