package 揭尹.剑指offer.字符串_正则表达式匹配;

import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/3
 * \* Time: 12:25
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class Solution {
    /**
     * 如果第二个字符是.的话，这题很容易，但是最难的地方在于第二个字符是*
     * 第二个如果是*，那么第一个字符是否匹配，不匹配，pattern直接跳2格
     * 如果匹配，将分为3种情况考虑:
     * 1.例如:aa和a*aa，*前面的数可以是0个，那么pattern直接跳2格
     * 2.例如:aa和a*a，*前面的数可以是1个，那么str跳1格，pattern跳2格
     * 3.例如:aa和a*,*前面的数可以是2个，那么str跳1格
     * @param str
     * @param pattern
     * @return
     */
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null)
            return false;
        return match(str,0,pattern,0);
    }

    private boolean match( char[] str, int i, char[] pattern, int j ) {
        if(j==pattern.length)
            return str.length==i;
        if(j<pattern.length-1 && pattern[j+1]=='*'){
            if(str.length!=i && (str[i]==pattern[j] || pattern[j]=='.')){
                return match(str,i,pattern,j+2)||match(str,i+1,pattern,j+2)
                        ||match(str,i+1,pattern,j);
            }else
                return match(str,i,pattern,j+2);
        }
        if(str.length!=i && (str[i]==pattern[j]||pattern[j]=='.')){
            return match(str,i+1,pattern,j+1);
        }
        return false;
    }

}
