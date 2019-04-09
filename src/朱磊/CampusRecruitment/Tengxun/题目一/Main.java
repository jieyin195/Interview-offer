package 朱磊.CampusRecruitment.Tengxun.题目一;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: zl
 * @Date: 2019/4/5 20:16
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Character> stack = new Stack<>();
        String str = sc.next();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if(stack.isEmpty() || stack.peek() == c)
                stack.push(c);
            else
                stack.pop();
        }

        System.out.println(stack.size());
        sc.close();
    }
}
