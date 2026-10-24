class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        if (board.length != 9)
        {
                return false;
        }
        List<Set<Character>> columnSetList = new ArrayList<>(9);
        for (int i = 0; i < 9; i++)
        {
            columnSetList.add(new HashSet<Character>());
        }
        List<Set<Character>> boxSetList = new ArrayList<>(9);
        for (int i = 0; i < 9; i++)
        {
            boxSetList.add(new HashSet<Character>());
        }
        for (int i = 0; i < board.length; i++)
        {
            if (board.length != 9)
            {
                return false;
            }
            Set<Character> uniqueChar = new HashSet<>();
            for (int j = 0; j < board[i].length; j++)
            {
                if (board[i].length != 9)
                {
                    return false;
                }
                if((board[i][j] == '.'))
                {
                    continue;
                }
                else if((Character.getNumericValue(board[i][j]) > 9 
                    || Character.getNumericValue(board[i][j]) < 1))
                {
                        return false;
                }
                else if (uniqueChar.contains(board[i][j]))
                {
                    return false;
                }
                uniqueChar.add(board[i][j]);
                if (columnSetList.get(j).contains(board[i][j]))
                {
                    return false;
                }
                columnSetList.get(j).add(board[i][j]);
                
                if(boxSetList.get((i / 3) * 3 + (j / 3)).contains(board[i][j]))
                {
                    return false;
                }
                boxSetList.get((i / 3) * 3 + (j / 3)).add(board[i][j]);
            }
        }
        return true;
    }
}
