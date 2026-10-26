class Solution {
    public int singleNumber(int[] nums)
    {   
        int currentNum = 0;
        for (int num: nums)
        {
            currentNum ^= num;
        }
        return currentNum;
    }
}
