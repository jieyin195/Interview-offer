package 揭尹.再刷剑指offer.No53_在排序数组中查找数字;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/22
 * \* Time: 23:01
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {

    public  int GetNumberOfK(int []  data ,double k) {
        return biSearch(data, k+0.5) - biSearch(data, k-0.5) ;
    }
    private  int biSearch(int[] data, double num){
        int s = 0, e = data.length-1;
        while(s <= e){
            int mid = (e - s)/2 + s;
            if(data[mid] < num)
                s = mid + 1;
            else if(data[mid] > num)
                e = mid - 1;
        }
        return s;
    }
}
