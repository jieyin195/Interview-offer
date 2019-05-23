package 揭尹.剑指offer.变态跳台阶;

/**
 * Created by Jline on 2019/4/1.
 */
public class Solution {
    public int JumpFloorII(int target) {
        if(target<1)
            return 0;
        if(target==1)
            return 1;
        int a=1;
        int b=2;
        for (int i = 2; i <=target ; i++) {
            b=2*a;
            a=b;
        }
        return b;
    }
}
