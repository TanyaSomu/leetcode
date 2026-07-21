class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'X') {
                    cnt++;
                    if(i == 0 && j == 0) {
                        continue;
                    }
                    else if(i == 0 && board[i][j - 1] =='X') cnt--;
                    else if(j == 0 && board[i -1][j] == 'X') cnt--;
                    else if(i == 0 || j == 0) continue;
                    else if(board[i - 1][j] == 'X' || board[i][j - 1] == 'X') cnt--;
                }
            }
        }
        return cnt;
    }
}