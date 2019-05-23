package 揭尹.剑指offer.跳台阶;

/**
 * Created by Jline on 2019/4/1.
 */
public class Solution {
    public int JumpFloor(int target) {
        if(target<1)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        int a=1,b=2 ,temp=0;
        for (int i =3 ; i <=target ; i++) {
             temp = a+b;
            a=b;
            b=temp;
        }
        return temp;
    }
}
