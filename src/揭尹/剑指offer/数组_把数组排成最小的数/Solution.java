package 揭尹.剑指offer.数组_把数组排成最小的数;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/24
 * \* Time: 10:48
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static String PrintMinNumber(int [] numbers) {
       ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arrayList.add(numbers[i]+"");
        }
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare( String str1, String str2 ) {
                String s1 = str1+str2;
                String s2 = str2+str1;
                return s1.compareTo(s2);
            }
        });
        String a="";
        for(String s: arrayList)
            a+=s;
        return a;
    }

}