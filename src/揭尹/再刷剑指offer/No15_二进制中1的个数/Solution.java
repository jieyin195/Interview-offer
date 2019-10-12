package 揭尹.再刷剑指offer.No15_二进制中1的个数;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/12
 * \* Time: 12:49
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            n=(n-1)&n;
            count++;
        }
        return count;
    }
}
