class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int leftIndex = 0;
        int longestSoFar = 0;
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            while(charSet.contains(c))
            {
                charSet.remove(s.charAt(leftIndex));
                leftIndex++;
            }
            charSet.add(c);
            if (i - leftIndex + 1 > longestSoFar)
            {
                longestSoFar = i - leftIndex + 1;   
            }
        }
    return longestSoFar;
    }
}
