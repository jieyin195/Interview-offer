package JianzhiOffer.替换空格;

/**
 * @Author: zl
 * @Date: 2019/3/6 18:43
 * @Description:请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("x x x");
        System.out.println(replaceSpace(sb));
        System.out.println(otherSolution(sb));
    }

    // 转化为String类型，然后用replace方法来处理
    public static String replaceSpace(StringBuffer str) {
        if(str == null) return null;

        return str.toString().replace(" ","%20");
    }
    // 逐个字节查找，当找到空格时，替换为%20
    public static String otherSolution(StringBuffer str) {
        if(str == null) return null;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                str.replace(i, i + 1, "%20");
        }

        return str.toString();
    }
}
