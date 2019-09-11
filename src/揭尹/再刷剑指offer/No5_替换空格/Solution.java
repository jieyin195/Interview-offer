package 揭尹.再刷剑指offer.No5_替换空格;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/10
 * \* Time: 13:27
 * \* To change this template use File | Settings | File Templates.
 * \* Description:请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * \
 */
public class Solution {
    public static String replaceSpace(StringBuffer str) {
        char[] data = str.toString().toCharArray();
        int newLength = data.length;
        for (int i = 0; i < data.length; i++) {
            if(data[i]==' ')
                newLength+=2;
        }
        char[] newdata = new char[newLength];
        for (int oldValue = data.length-1,newValue = newLength-1; oldValue >=0  ; oldValue--,newValue--) {
            if(data[oldValue]==' '){
                newdata[newValue--]='0';
                newdata[newValue--]='2';
                newdata[newValue]='%';
            }else{
                newdata[newValue]=data[oldValue];
            }
        }
        String s="";
        for (int i = 0; i < newdata.length; i++) {
            s+=newdata[i];
        }
        return s;
    }

    public static void main( String[] args ) {
        StringBuffer str= new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));
    }
}
