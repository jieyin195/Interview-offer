package 揭尹.三刷算法题.No5_替换空格;

public class Solution {
    public String replaceSpace(String s) {
        char[] charArr = new char[s.length()*3];
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            if(c==' '){
                charArr[count++]='%';
                charArr[count++]='2';
                charArr[count++]='0';
            }else{
                charArr[count++]=c;
            }
        }
        return new String(charArr,0,count);
    }
}
