package 揭尹.三刷算法题.No14_剪绳子;

public class Solution {
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        if (n==3)
            return 2;
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        int res=0;
        for (int i = 4; i <= n ; i++) {
            for (int j = 1; j <= i/2 ; j++) {
                res = Math.max(res,dp[j]*dp[i-j]);
            }
            dp[i]=res;
        }
        return dp[n];


    }
}
