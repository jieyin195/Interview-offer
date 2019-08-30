package 揭尹.剑指offer.字符串_左旋转字符串;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/28
 * \* Time: 15:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
 * 就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0){
            return str;
        }
        ArrayList<String> queue = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i)+"");
        }
        for (int i = 0; i < n; i++) {
            queue.add(queue.remove(0));
        }
        String s= "";
        for(String st:queue){
            s+=st;
        }
        return s;
    }
}
