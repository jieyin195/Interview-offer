package 揭尹.三刷算法题.No48_最长不含重复字符的子字符串;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
        int start=-1,max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                start=Math.max(start,map.get(s.charAt(i)));
            }
            map.put(s.charAt(i),i);
            max = Math.max(i-start,max);
        }
        return max;
    }
}
