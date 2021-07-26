package 揭尹.leetcode经典算法题.零一背包问题;

public class Solution {
    public static void main(String[] args) {
        int[] w = {0,2,3,4,5};
        int[] v = {0,3,4,5,6};
        int N = 8;
        int[][] dp = new int[w.length][N+1];
        for (int i = 1; i < w.length; i++) {
            for (int j = 1 ; j <= N ; j++) {
                if(j<w[i]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
                }
            }
        }
        System.out.println(dp[w.length-1][N]);
    }


}
