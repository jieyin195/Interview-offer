package 揭尹.三刷算法题.No12_矩阵中的路径;

public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs(board,words,i,j,0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=words[k])
            return false;
        if(k==words.length-1)
            return true;
        board[i][j]=' ';
        if(dfs(board,words,i-1,j,k+1)||dfs(board,words,i+1,j,k+1)||dfs(board,words,i,j+1,k+1)||dfs(board,words,i,j-1,k+1)){
            return true;
        }
        board[i][j]=words[k];
        return false;
    }
}
