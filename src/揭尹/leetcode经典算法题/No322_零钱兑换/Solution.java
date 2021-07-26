package 揭尹.leetcode经典算法题.No322_零钱兑换;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1)
            return 0;
        int[] dp = new int[amount+1];
        int res=Integer.MAX_VALUE;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(coins[j]<=i)
                    res = Math.min(res,dp[i-coins[j]]+1);
            }
            dp[i]=res;
        }
        return dp[amount];
    }
}
