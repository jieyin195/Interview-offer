package 揭尹.三刷算法题.No66_构建乘积数组;

public class Solution {
    public int[] constructArr(int[] a) {
        if(a==null||a.length==0||a.length==1)
            return new int[]{};
        int[] b = new int[a.length];
        b[0]=1;
        int tmp=1;
        for (int i = 1; i < b.length; i++) {
            b[i]=b[i-1]*a[i-1];
        }
        for (int i = a.length-2; i >=0 ; i--) {
            tmp*=a[i+1];
            b[i]*=tmp;
        }
        return b;
    }
}
