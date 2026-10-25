class Solution {
    public boolean isValid(String s) 
    {
        boolean openBracket = false;
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
        if(!stack.isEmpty())
        {
            return false;
        }
        return true;
    }
}
