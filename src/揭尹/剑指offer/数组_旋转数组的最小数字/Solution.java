package 揭尹.剑指offer.数组_旋转数组的最小数字;

/**
 * Created by Jline on 2019/4/1.
 */
import java.util.Arrays;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        Arrays.sort(array);
        return array[0];
    }
}