package 揭尹.再刷剑指offer.No10_1_斐波拉契数列;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 14:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public int Fibonacci(int n) {
        if(n==0||n==1)
            return n;
        int first=1;
        int second=0;
        int sum=0;
        for (int i = 2; i <= n; i++) {
            sum=first+second;
            second=first;
            first=sum;
        }
        return sum;
    }
}
