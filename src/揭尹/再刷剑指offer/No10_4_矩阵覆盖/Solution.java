package 揭尹.再刷剑指offer.No10_4_矩阵覆盖;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 10:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static int RectCover(int n) {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }

    public static void main( String[] args ) {
        System.out.println(RectCover(3));
    }
}
