package 揭尹.剑指offer.字符串_第一个只出现一次的字符;

import java.util.LinkedHashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/24
 * \* Time: 16:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.
 */

public class Solution {
    public  static int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(linkedHashMap.containsKey(c))
                linkedHashMap.put(c,linkedHashMap.get(c)+1);
            else
                linkedHashMap.put(c,1);
        }

        for (int i = 0; i <str.length() ; i++) {
            if(linkedHashMap.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }

    public static void main( String[] args ) {
        System.out.println(FirstNotRepeatingChar("google"));
    }
}
