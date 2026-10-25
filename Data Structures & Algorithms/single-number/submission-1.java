class Solution {
    public int singleNumber(int[] nums)
    {   
        Set<Integer> intSet = new HashSet<>();
        for (int num: nums)
        {
            if(intSet.contains(num))
            {
                intSet.remove(num);
            }
            else
            {
                intSet.add(num);
            }
        }
        return intSet.iterator().next();
    }
}
