package 揭尹.剑指offer.孩子们的游戏;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/28
 * \* Time: 16:38
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0)
            return -1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        int count=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.size()==1)
                break;
            if(count==m-1){
                arrayList.remove(i);
                count=-1;
                i--;
            }
            if(i==arrayList.size()-1){
                i=-1;
            }
            count++;
        }
        return arrayList.get(0);
    }

    public static void main( String[] args ) {
        System.out.println(LastRemaining_Solution(5,3));
    }
}
