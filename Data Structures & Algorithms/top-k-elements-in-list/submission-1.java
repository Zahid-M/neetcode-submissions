class Solution 
{
    public int[] topKFrequent(int[] nums, int k)
    {
        Map<Integer, Integer> frequency = new HashMap<>(); 
        for(int num : nums)
        {
            if(frequency.containsKey(num))
            {
                frequency.put(num, frequency.get(num) + 1);
            }
            else
            {
                frequency.put(num, 1);
            }
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : frequency.keySet())
        {
            int freq = frequency.get(key);
            if(buckets[freq] == null)
            {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i > 0; i--)
        {
            if(buckets[i] == null)
            {
                
            }
            else
            {
                for(int j = 0; j < buckets[i].size(); j++)
                {
                    result[index] = buckets[i].get(j);
                    index++;
                    if(index == k)
                    {
                        return result;
                    }
                }
            }
            
        }
        return result;
    
    }    
}
