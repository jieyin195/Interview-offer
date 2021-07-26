package 揭尹.三刷算法题.No46_把数字翻译成字符串;

public class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= s.length(); i++) {
            String str = s.substring(i-2,i);
            if(str.compareTo("10")>=0&&str.compareTo("25")<=0)
                dp[i]=dp[i-1]+dp[i-2];
            else
                dp[i]=dp[i-1];
        }
        return dp[s.length()];
    }
}
