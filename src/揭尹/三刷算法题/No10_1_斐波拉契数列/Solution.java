package 揭尹.三刷算法题.No10_1_斐波拉契数列;

public class Solution {
    public int fib(int n) {
        if(n==0||n==1)
            return n;
        int sum=0;
        int a=1;
        int b=0;
        for (int i = 2; i <= n; i++) {
            sum=(a+b)%1000000007;
            b = a;
            a = sum;
        }
        return sum;
    }
}
