package 揭尹.三刷算法题.No11_旋转数组的最小数字;

public class Solution {
    public int minArray(int[] numbers) {
        if(numbers==null||numbers.length==0)
            return 0;
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int mid = ((right-left)>>1)+left;
            if(numbers[left]<numbers[right]){
                return numbers[left];
            }else if(numbers[left]>numbers[right]){
                if(numbers[left]<=numbers[mid]){
                    left = mid+1;
                }else{
                    right = mid;
                }
            }else{
                if(numbers[left]<numbers[mid]){
                    left = mid+1;
                }else if(numbers[left]>numbers[mid]){
                    right = mid;
                }else{
                    left++;
                    right--;
                }
            }
        }
        return numbers[left];
    }
}
