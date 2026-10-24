class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] leftRight = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            leftRight[0] = nums[i];
            for(int j = i+1; j < nums.length; j++) 
            {
               leftRight[1] = nums[j];
               if (leftRight[0] + leftRight[1] == target)
               {
                    return new int[]{i, j};
               } 
            }
        }
        return new int[]{};
    }
}
