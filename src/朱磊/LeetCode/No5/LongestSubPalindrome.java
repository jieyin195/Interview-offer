package LeetCode.No5;

/**
 * @Author: zl
 * @Date: 2019/3/4 12:56
 * @Description:
 */
public class LongestSubPalindrome {

    public static void main(String[] args) {
        String s = "aacdefcaa";
        System.out.println(longestPalindrome(s));
    }

    /**
     *  回文判断，可以用原字符串和对应的逆序字符串来包含比较
     *  abcb -> bcba
     *  其中只有bcb可能包含对称关系
     *  在逆序字符串 bcba 中判断是否包含 bcb
     */
    public static String longestPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        String reverseStr = sb.reverse().toString();    // 用于存放参数的逆字符串，作为镜像比较
        String res = "";
        int count = 0;
        int max = 0;
        int start, end;     // 两根指针，分别指向原始字符串的开头和结尾
        for (int i = 0; i < s.length(); i++) {
            start = i;      // 初始化头指针和尾指针
            for (end = s.length(); ; end--) {
                count = end - start;
                if(count <= 0)    break;
                // 每次都对字符串头尾指向的指针进行切割
                String subStr = s.substring(start, end);
                // 重点判断头尾的两个元素是否相等，相等的话即为回文字符串
                if(subStr.charAt(0) == subStr.charAt(subStr.length() - 1) && reverseStr.contains(subStr) && count > max){
                    res = subStr;
                    max = count;
                }
            }
        }
        return res;
    }
}
