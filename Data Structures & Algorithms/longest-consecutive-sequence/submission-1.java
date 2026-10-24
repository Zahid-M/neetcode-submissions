class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> setOfNums = new HashSet<>();
        for (int num: nums)
        {
            setOfNums.add(num);
        }
        int longestCounter = 0;
        for (int num: nums)
        {
            if(!setOfNums.contains(num - 1))
            {
                int current = num;
                int counter = 1;
                while(setOfNums.contains(current + 1))
                {
                    counter++;
                    current++;
                }
                longestCounter = Math.max(longestCounter, counter);
            }
        
        }
        return longestCounter;
    }
}
