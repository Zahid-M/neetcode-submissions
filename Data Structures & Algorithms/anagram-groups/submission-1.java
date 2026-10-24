class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>(); 
        for (String str: strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (anagramMap.containsKey(sortedString))
            {
                anagramMap.get(sortedString).add(str);
            }
            else
            {
                 List<String> anagramList = new ArrayList<>();
                 anagramList.add(str);
                 anagramMap.put(sortedString, anagramList);
            }
        }
        return new ArrayList<>(anagramMap.values());
    }
}
