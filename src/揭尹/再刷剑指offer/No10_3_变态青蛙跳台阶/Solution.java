package 揭尹.再刷剑指offer.No10_3_变态青蛙跳台阶;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 15:18
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public int JumpFloorII(int n) {
        //f(n)=2*f(n-1)
        return 1<<(n-1);
    }
}
