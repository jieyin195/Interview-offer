package 揭尹.字符串.字符串排序;

import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/29
 * \* Time: 15:58
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class LSD {
    public static void main( String[] args ) {
        String[] str = new String[]{"4PGC938","2IYE230","3CIO720","1ICK750","1OHV845","4JZY524","1ICK750","3CIO720",
        "1OHV845"};
        Sort(str,7);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    private static void Sort( String[] a, int w ) {
        int N = a.length;
        int R = 256;
        String[] aux = new String[N];
        for (int d = w-1; d>=0 ; d--) {
            int[] count = new int[R+1];
            for (int i = 0; i < N; i++) {
                count[a[i].charAt(d)+1]++;
            }
            for (int i = 0; i < R; i++) {
                count[i+1]+=count[i];
            }
            for (int i = 0; i < N; i++) {
                aux[count[a[i].charAt(d)]++]=a[i];
            }
            for (int i = 0; i < N; i++) {
                a[i]=aux[i];
            }
        }
    }
}
