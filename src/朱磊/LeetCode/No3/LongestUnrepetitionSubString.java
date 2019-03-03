package LeetCode.No3;

import java.util.LinkedList;

/**
 * @Author: zl
 * @Date: 2019/3/2 17:40
 * @Description:
 */
public class LongestUnrepetitionSubString {

    public static void main(String[] args) {
        int result = Solution("ohomm");
        System.out.println(result);
    }

    public static int Solution(String s) {
        if (s.length() == 0 || s == null)    return 0;
        if (s.length() == 1)    return 1;

        LinkedList<Character> list = new LinkedList<>();
        int count = 0;  // 用来保存连续不重复的子串
        int max = 0;    // 用来保存最大值
        for (int i = 0; i < s.length(); i++) {
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                count = list.size();    // 连续不重复的子串直接是等于集合的大小
                if(count > max) max = count;
            }
            else{
                list.add(s.charAt(i));
                // 用index来标记集合中出现的首个重复字符的位置
                int index = list.indexOf(s.charAt(i));
                for (int j = 0; j <= index; j++) {
                    list.remove(0); // 删除重复元素之前的所有字符（包含当前这个重复字符）
                }
            }
        }

        return max;
    }
}
