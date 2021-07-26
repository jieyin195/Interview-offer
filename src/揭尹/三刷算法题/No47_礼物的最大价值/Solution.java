package 揭尹.三刷算法题.No47_礼物的最大价值;

public class Solution {
    public int maxValue(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] dp = new int[n+1][m+1];
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                dp[i][j] = grid[i-1][j-1]+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
