class Solution {
    public boolean isValidSudoku(char[][] board) {
        // redo
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                char ch = board[i][j];
                if(ch == '.') continue;
                int boxIdx = i/3 * 3 + j/3;
                if(!row[i].add(ch) || !col[j].add(ch) || !box[boxIdx].add(ch)) return false;
            }
        }
        return true;
    }
}
