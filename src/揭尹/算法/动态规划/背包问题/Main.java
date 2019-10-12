package 揭尹.算法.动态规划.背包问题;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/31
 * \* Time: 10:27
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Main {
    public static void main( String[] args ) {
        int[] w = new int[]{0,2,3,4,5};
        int[] v = new int[]{0,3,4,5,6};
        int N=8;
        int[][] dp = new int[w.length][N+1];
        for (int i = 1; i <= w.length-1; i++) {
            for (int j = 1; j <= N; j++) {
                if(j<w[i]){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
                }
            }
        }
        System.out.println(dp[w.length-1][N]);
    }
}
