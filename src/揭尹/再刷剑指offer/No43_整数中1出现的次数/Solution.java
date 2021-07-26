package 揭尹.再刷剑指offer.No43_整数中1出现的次数;

import java.util.Scanner;

public class Solution {
    public static int countDigitOne(int n) {
        int dight = 1,res = 0;
        int high = n/10, cur = n%10, low =0;
        while(high!=0||cur!=0){
            if(cur==0) res+=high*dight;
            else if(cur==1) res+=high*dight+1+low;
            else res+=(high+1)*dight;
            low+=cur*dight;
            cur=high%10;
            high=high/10;
            dight*=10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = countDigitOne(sc.nextInt());
        System.out.println(count);
    }
}
