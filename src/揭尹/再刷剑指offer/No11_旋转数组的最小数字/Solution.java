package 揭尹.再刷剑指offer.No11_旋转数组的最小数字;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 17:00
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static int min(int[] data){
        if(data.length==0)
            return 0;
        int left=0;
        int right=data.length-1;
        while(left<right){
            int mid = ((right-left)>>1)+left;
            if(data[left]<data[right])
                return data[left];
            else if(data[left]>data[right]){
                if(data[left]<=data[mid])
                    left=mid+1;
                else
                    right=mid;
            }
            else{
                if(data[left]<data[mid]){
                    left=mid+1;
                }else if(data[left]>data[mid]){
                    right=mid;
                }else{
                    left++;
                    right--;
                }
            }
        }
        return data[left];
    }
    public static void main(String[] args){
        int[] data1 = {3,4,5,1,2};
        int[] data2 = {1,0,1,1,1};
        int[] data3 = {1,1,1,0,1};
        System.out.println(min(data1));
        System.out.println(min(data2));
        System.out.println(min(data3));
    }
}
