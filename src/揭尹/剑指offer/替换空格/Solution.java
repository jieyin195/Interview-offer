package 揭尹.剑指offer.替换空格;

/**
 * Created by Jline on 2019/2/25.
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        s=s.replaceAll("\\s","%20");
        return s;
    }

    public static void main( String[] args ) {
        Solution solution = new Solution();
        StringBuffer sb = new StringBuffer("We are aaa");
        String s= solution.replaceSpace(sb);
        System.out.println(s);
    }
}
