package 揭尹.剑指offer.字符串_表示数值的字符串;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/4
 * \* Time: 20:26
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，
 * 字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class Solution {
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }
}
