package 揭尹.LeetCode.No63_不同路径Ⅱ;

/**
 * Created by Jline on 2019/3/27.
 */
public class Solution {
    public int uniquePaths(int[][] obstacleGrid) {
        int m = obstacleGrid.length,n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0]=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(obstacleGrid[i][j]==1)
                    dp[i][j]=0;
                else if(i==0&&j>0)
                    dp[i][j]=dp[i][j-1];
                else if(i>0&&j==0)
                    dp[i][j]=dp[i-1][j];
                else if(i>0&&j>0)
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
