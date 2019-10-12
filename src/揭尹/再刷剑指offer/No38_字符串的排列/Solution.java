package 揭尹.再刷剑指offer.No38_字符串的排列;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/15
 * \* Time: 17:18
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
     ArrayList<String> list = new ArrayList<>();
    public  ArrayList<String> Permutation( String str) {
        if(str.length()==0)
            return list;
        zuhe(str,0,new ArrayList<Character>());
        return list;
    }

    private  void zuhe( String str, int index, ArrayList<Character> c ) {
        if(index==str.length()){
            String s="";
            for (int i = 0; i < c.size(); i++) {
                s+=c.get(i);
            }
            list.add(s);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(!c.contains(str.charAt(i))){
                c.add(str.charAt(i));
                zuhe(str,index+1,c);
                c.remove(c.size()-1);
            }
        }
    }


}
