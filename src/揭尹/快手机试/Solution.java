package 揭尹.快手机试;

import java.util.Scanner;

/**
 * Created by Jline on 2019/3/30.
 */
public class Solution {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String str =Integer.toBinaryString(n);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c==49)
                count++;
        }
        System.out.println(String.valueOf(count));
    }
}
