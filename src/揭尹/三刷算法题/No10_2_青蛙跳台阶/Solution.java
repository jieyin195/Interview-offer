package 揭尹.三刷算法题.No10_2_青蛙跳台阶;

public class Solution {
    public int numWays(int n) {
        if(n==0||n==1)
            return n;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
