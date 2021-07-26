package 揭尹.三刷算法题.No42_连续子数组的最大和;

public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+nums[i];
            }else{
                dp[i]=nums[i];
            }
            res=Math.max(dp[i],res);
        }
        return res;
    }
}
