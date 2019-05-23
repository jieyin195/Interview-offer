package 揭尹.剑指offer.包含min函数的栈;

import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/18
 * \* Time: 19:18
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty()||node<stack2.peek()){
            stack2.push(node);
        }else
            stack2.push(stack2.peek());
    }

    public void pop() {
            stack1.pop();
            stack2.pop();
    }

    public int top() {
        return stack1.peek();

    }

    public int min() {
        return stack2.peek();
    }
}
