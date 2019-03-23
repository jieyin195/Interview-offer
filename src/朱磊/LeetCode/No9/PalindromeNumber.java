package LeetCode.No9;

/**
 * @Author: zl
 * @Date: 2019/3/23 20:32
 * @Description: 判断一个数字是否为回文数
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        int input = 1;
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int x) {
        String oldStr = String.valueOf(x);
        StringBuilder newStr = new StringBuilder(oldStr);
        if(oldStr.equals(newStr.reverse().toString()))
            return true;
        return false;
    }
}
