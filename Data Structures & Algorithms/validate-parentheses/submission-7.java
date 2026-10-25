class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMap = Map.of(
            '{', '}',
            '[',']',
            '(',')'
        );
        for (int i = 0; i < s.length(); i ++)
        {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']')
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                else if(s.charAt(i) != bracketMap.get(stack.pop()))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
