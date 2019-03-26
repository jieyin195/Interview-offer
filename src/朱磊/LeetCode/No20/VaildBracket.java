package 朱磊.LeetCode.No20;

import java.util.Stack;

/**
 * @Author: zl
 * @Date: 2019/3/23 20:59
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *              有效字符串需满足：
 *              左括号必须用相同类型的右括号闭合。
 *              左括号必须以正确的顺序闭合。
 *              注意空字符串可被认为是有效字符串。
 */
public class VaildBracket {

    public static void main(String[] args) {
        String s = "([)";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if(s.length() == 0)     // 为空则直接返回true
            return true;
        // 分别使用两个栈。一边为输入的字符，另一边如果存放匹配字符
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        char[] match = s.toCharArray();
        // 首先将字符全部存储到左边的栈中
        for (int i = 0; i < match.length; i++)
            left.push(match[i]);

        while (!left.isEmpty()) {
            if(left.peek() == ' '){     // 如果存在空字符串，则跳过继续
                left.pop();
                continue;
            }
            if(!right.isEmpty() && isMatch(left.peek(), right.peek())) {    // 如果左右栈顶的符号恰好匹配，则让两边的符号同时出栈
                right.pop();
                left.pop();
                continue;
            }
            right.push(left.pop());     // 如果不匹配，则把左边的符号压栈到右边
        }

        return right.size() == 0;   // 如果最后，右边的栈恰好为空，则表明符号恰好匹配
    }
    // 判断符号是否匹配的方法
    public static boolean isMatch(char left, char right) {
        return (left == '(' && right == ')') || (left == '{' && right == '}') || (left == '[' && right == ']');
    }
}
