package 揭尹.三刷算法题.No31_栈的压入和弹出;

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j =0;
        for (int num:pushed){
            stack.add(num);
            while(!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
