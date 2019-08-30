package 揭尹.剑指offer.数组_数组中的逆序对;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/24
 * \* Time: 17:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class Solution {
    public static int InversePairs(int [] array) {
        if(array==null||array.length==0)
        {
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            copy[i] = array[i];
        }
        int count = InversePairs(array,copy,0,array.length-1);
        return count%1000000007;
    }

    private static int InversePairs( int[] array, int[] copy, int start, int end ) {
        if(start==end)
            return 0;
        int mid = (end-start)/2;
        int leftCount = InversePairs(copy,array,start,start+mid);
        int rightCount = InversePairs(copy,array,start+mid+1,end);

        int count=0;
        int i = start+mid;
        int j = end;
        int lastPoint = end;
        while(i>=start && j>=start+mid+1){
            if(array[i]>array[j]){
                copy[lastPoint--] = array[i--];
                count+=j-start-mid;
                if(count>=1000000007)//数值过大求余
                {
                    count%=1000000007;
                }
            }else{
                copy[lastPoint--] = array[j--];
            }
        }
        for(; i>=start;i--)
            copy[lastPoint--]=array[i];
        for(;j>=start+mid+1;j--)
            copy[lastPoint--]=array[j];

        return (leftCount+rightCount+count)%1000000007;
    }

}