class Solution 
{
    public int maxArea(int[] heights)
    {
        int bestAmount = 0;
        int leftPointer = 0;
        int rightPointer = heights.length - 1;
        while(leftPointer < rightPointer)
        {
            if ((rightPointer - leftPointer) * Math.min(heights[rightPointer], (heights[leftPointer])) > bestAmount)
            {
                bestAmount = (rightPointer - leftPointer) * Math.min(heights[rightPointer], (heights[leftPointer]));
            }
            if (heights[leftPointer] < heights[rightPointer])
            {
                leftPointer++;
            }
            else
            {
                rightPointer--;
            }
        }
        return bestAmount;
    }
}
