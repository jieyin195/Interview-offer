package 揭尹.剑指offer.斐波拉契数列;

/**
 * Created by Jline on 2019/4/1.
 */
public class Solution {
    public int Fibonacci(int n) {
        if(n<=0)
            return n;
        int[] memo=new int[n+1];
        memo[0]=0;
        memo[1]=1;
        for (int i = 2; i <= n; i++) {
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
    }
}
