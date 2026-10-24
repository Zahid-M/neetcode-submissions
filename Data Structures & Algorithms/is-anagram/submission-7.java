class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        String sortedSString = new String(sChars);
        String sortedTString = new String(tChars);
        return (sortedSString.equals(sortedTString));
    }
}
