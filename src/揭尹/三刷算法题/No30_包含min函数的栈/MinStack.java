package 揭尹.三刷算法题.No30_包含min函数的栈;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack1 ;
    Stack<Integer> stack2 ;
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()||stack2.peek()>x){
            stack2.push(x);
        }else{
            stack2.push(stack2.peek());
        }
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
