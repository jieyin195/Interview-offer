package 揭尹.三刷算法题.No9_1_用两个栈实现队列;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 ;
    Stack<Integer> stack2 ;

    public Solution() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else{
            while(!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
            return stack2.isEmpty()?-1:stack2.pop();
        }
    }
}
