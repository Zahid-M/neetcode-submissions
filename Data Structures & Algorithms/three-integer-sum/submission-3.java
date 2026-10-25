class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);  
        List<List<Integer>> result = new ArrayList<>();     
        for (int i = 0; i < nums.length; i++)
        {
            if(i > 0)
            {
                if(nums[i] == nums[i-1])
                {
                    continue;
                }
            }
            
            int startPointer = i + 1;
            int endPointer = nums.length - 1;
            while (startPointer < endPointer)
            {
                int sum = nums[i] + nums[startPointer] + nums[endPointer];
                if (sum < 0)
                {
                    startPointer++;
                }
                else if (sum > 0)
                {
                    endPointer--;
                }
                if(sum == 0)
                {
                    result.add(Arrays.asList(nums[i], nums[startPointer], nums[endPointer]));  
                    startPointer++;       
                    while (startPointer < endPointer && nums[startPointer] == nums[startPointer - 1])
                    {
                        startPointer++;
                    }
                }

            }
        }
        return result;
    }
}
