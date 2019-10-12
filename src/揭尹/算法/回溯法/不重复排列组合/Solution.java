package 揭尹.算法.回溯法.不重复排列组合;

import java.util.ArrayList;
import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 20:28
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    static ArrayList<String> list =new ArrayList<>();
    public static void zuhe( String str, int index, ArrayList<Character> c){
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

    public static void main( String[] args ) {
        zuhe("123",0,new ArrayList<>());
        System.out.println(list);
        System.out.println(list.size());
    }
}
