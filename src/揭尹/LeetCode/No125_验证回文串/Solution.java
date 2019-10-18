package 揭尹.LeetCode.No125_验证回文串;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/10/13
 * \* Time: 23:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(s=="")
            return true;
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if((c>='0'&&c<='9')||(c>='a'&&c<='z'))
                sb.append(c);
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
