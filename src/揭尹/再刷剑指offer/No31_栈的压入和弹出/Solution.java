package 揭尹.再刷剑指offer.No31_栈的压入和弹出;

import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 21:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0,j=0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while(j<popA.length&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
