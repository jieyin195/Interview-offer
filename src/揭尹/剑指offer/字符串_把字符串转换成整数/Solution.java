package 揭尹.剑指offer.字符串_把字符串转换成整数;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/28
 * \* Time: 20:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 *  输入描述:
    输入一个字符串,包括数字字母符号,可以为空
    输出描述:
    如果是合法的数值表达则返回该数字，否则返回0
     输入
     +2147483647
     1a33
     复制
     2147483647
     0
 */
public class Solution {
    public static int StrToInt(String str) {
        if(str.length()==0)
            return 0;
        int flag = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='+'){
                continue;
            }
            if(str.charAt(i)=='-'){
                flag=-1;
                continue;
            }
            if(str.charAt(i)<48||str.charAt(i)>57){
                return 0;
            }else{
                int a = str.charAt(i)-48;
                arrayList.add(a);
            }
        }
        int sum=0;
        for (int i = arrayList.size()-1,j=1; i >=0; i--,j*=10) {
            sum+=arrayList.get(i)*j;
        }
        if(flag==1)
            return sum;
        else
            return 0-sum;
    }

    public static void main( String[] args ) {
        String str = "+123";
        System.out.println(StrToInt(str));

    }
}
