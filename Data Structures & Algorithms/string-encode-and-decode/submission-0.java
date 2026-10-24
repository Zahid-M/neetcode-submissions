class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder result = new StringBuilder();
        for (String s: strs)
        {
            result.append(s.length());
            result.append("\n"); 
            result.append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) 
    {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length())
        {
            int spaceIndex = str.indexOf("\n");
            int distance = Integer.parseInt(str.substring(0, spaceIndex));
            int start = spaceIndex + 1;
            int end = start + distance;
            result.add(str.substring(start, end));
            str = str.substring(end, str.length());
        }
        return result;

    }
}
