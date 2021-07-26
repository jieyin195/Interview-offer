package 揭尹.再刷剑指offer.No17_打印1到最大的n位数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/13
 * \* Time: 10:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        printToMaxOfNDigits(num);
    }

    private static void printToMaxOfNDigits( int num ) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append('0');
        }
        while(Increment(sb)){
            print(sb);
        }
    }

    private static void print(StringBuilder sb) {
        boolean flag=false;
        for (int i = 0; i < sb.length(); i++) {
            if(flag)
                System.out.print(sb.charAt(i));
            else if(sb.charAt(i)!='0'){
                flag=true;
                System.out.print(sb.charAt(i));
            }
        }
        System.out.println();
    }

    private static boolean Increment( StringBuilder sb ) {
        for (int i = sb.length()-1; i >=0; i--) {
            if(sb.charAt(i)<'9'&&sb.charAt(i)>='0'){
                sb.setCharAt(i,(char)(sb.charAt(i)+1));
                return true;
            }
            else if(sb.charAt(i)=='9')
                sb.setCharAt(i,'0');
            else {
                return false;
            }
        }
        return false;
    }
}
