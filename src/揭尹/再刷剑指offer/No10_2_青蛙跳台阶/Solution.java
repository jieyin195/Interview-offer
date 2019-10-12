package 揭尹.再刷剑指offer.No10_2_青蛙跳台阶;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 14:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static int JumpFloor(int n) {
//        if(n==1)
//            return 1;
//        if(n==2)
//            return 2;
//        n=JumpFloor(n-1)+JumpFloor(n-2);
//        return n;
        int[] dp = new int[n+1];
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main( String[] args ) {
        System.out.println(JumpFloor(1));
    }
}
